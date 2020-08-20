package com.appdevgenie.movie_db_kotlin.data.repository.artist

import android.content.ContentValues
import android.util.Log
import com.appdevgenie.movie_db_kotlin.data.model.artist.Artist
import com.appdevgenie.movie_db_kotlin.data.model.artist.ArtistList
import com.appdevgenie.movie_db_kotlin.data.repository.artist.datasource.ArtistCacheDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.artist.datasource.ArtistLocalDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.artist.datasource.ArtistRemoteDataSource
import com.appdevgenie.movie_db_kotlin.domain.repository.ArtistRepository
import retrofit2.Response

class ArtistRepositoryImpl(
    private val artistRemoteDataSource: ArtistRemoteDataSource,
    private val artistLocalDataSource: ArtistLocalDataSource,
    private val artistCacheDataSource: ArtistCacheDataSource
): ArtistRepository {

    override suspend fun getArtist(): List<Artist>? {
        return getArtistsFromCache()
    }

    override suspend fun updateArtist(): List<Artist>? {
        val newListOfArtists:List<Artist> = getArtistsFromAPI()
        artistLocalDataSource.clearAll()
        artistLocalDataSource.saveArtistsToDB(newListOfArtists)
        artistCacheDataSource.saveArtistsToCache(newListOfArtists)
        return newListOfArtists
    }

    suspend fun getArtistsFromAPI():List<Artist>{
        lateinit var artistList:List<Artist>

        try {
            val response: Response<ArtistList> = artistRemoteDataSource.getArtists()
            val body: ArtistList? = response.body()
            if(body!= null){
                artistList = body.artists
            }
        }catch (exception:Exception){
            Log.i(ContentValues.TAG, "getArtistsFromAPI: exception")
        }

        return artistList
    }

    suspend fun getArtistsFromDB():List<Artist>{
        lateinit var artistList:List<Artist>

        try {
            artistList = artistLocalDataSource.getArtistsFromDB()
        }catch (exception:Exception){
            Log.i(ContentValues.TAG, "getArtistsFromDB: exception")
        }

        if(artistList.size > 0){
            return artistList
        }else{
            artistList = getArtistsFromAPI()
            artistLocalDataSource.saveArtistsToDB(artistList)
        }
        return artistList
    }

    suspend fun getArtistsFromCache():List<Artist>{
        lateinit var artistList:List<Artist>

        try {
            artistList = artistCacheDataSource.getArtistsFromCache()
        }catch (exception:Exception){
            Log.i(ContentValues.TAG, "getArtistsFromCache: exception")
        }

        if(artistList.size > 0){
            return artistList
        }else{
            artistList = getArtistsFromDB()
            artistCacheDataSource.saveArtistsToCache(artistList)
        }
        return artistList
    }
}