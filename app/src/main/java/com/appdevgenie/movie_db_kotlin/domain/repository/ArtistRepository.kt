package com.appdevgenie.movie_db_kotlin.domain.repository

import com.appdevgenie.movie_db_kotlin.data.model.artist.Artist
import com.appdevgenie.movie_db_kotlin.data.model.movie.Movie

interface ArtistRepository {

    suspend fun getArtist():List<Artist>?
    suspend fun updateArtist():List<Artist>?
}