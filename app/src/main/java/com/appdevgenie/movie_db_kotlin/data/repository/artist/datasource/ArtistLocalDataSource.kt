package com.appdevgenie.movie_db_kotlin.data.repository.artist.datasource

import com.appdevgenie.movie_db_kotlin.data.model.artist.Artist

interface ArtistLocalDataSource {

    suspend fun getArtistsFromDB():List<Artist>
    suspend fun saveArtistsToDB(artist:List<Artist>)
    suspend fun clearAll()
}