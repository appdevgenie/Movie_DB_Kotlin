package com.appdevgenie.movie_db_kotlin.data.repository.artist

import com.appdevgenie.movie_db_kotlin.data.model.artist.Artist
import com.appdevgenie.movie_db_kotlin.domain.repository.ArtistRepository

class ArtistRepositoryImpl(): ArtistRepository {

    override suspend fun getArtist(): List<Artist>? {
        TODO("Not yet implemented")
    }

    override suspend fun updateArtist(): List<Artist>? {
        TODO("Not yet implemented")
    }
}