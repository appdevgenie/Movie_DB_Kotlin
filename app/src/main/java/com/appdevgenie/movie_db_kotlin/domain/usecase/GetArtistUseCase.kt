package com.appdevgenie.movie_db_kotlin.domain.usecase

import com.appdevgenie.movie_db_kotlin.data.model.artist.Artist
import com.appdevgenie.movie_db_kotlin.domain.repository.ArtistRepository

class GetArtistUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.getArtist()
}