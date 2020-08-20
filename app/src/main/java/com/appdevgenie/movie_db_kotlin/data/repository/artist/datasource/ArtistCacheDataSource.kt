package com.appdevgenie.movie_db_kotlin.data.repository.artist.datasource

import com.appdevgenie.movie_db_kotlin.data.model.artist.Artist

interface ArtistCacheDataSource {

    suspend fun getArtistsFromCache():List<Artist>
    suspend fun saveArtistsToCache(artists:List<Artist>)
}