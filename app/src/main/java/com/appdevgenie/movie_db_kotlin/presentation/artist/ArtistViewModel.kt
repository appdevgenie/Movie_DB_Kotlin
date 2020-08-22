package com.appdevgenie.movie_db_kotlin.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.appdevgenie.movie_db_kotlin.domain.usecase.GetArtistUseCase
import com.appdevgenie.movie_db_kotlin.domain.usecase.UpdateArtistUseCase


class ArtistViewModel(
    private val getArtistsUseCase: GetArtistUseCase,
    private val updateArtistsUseCase: UpdateArtistUseCase
): ViewModel() {

    fun getArtists() = liveData {
        val artistList = getArtistsUseCase.execute()
        emit(artistList)
    }

    fun updateArtists() = liveData {
        val artistList = updateArtistsUseCase.execute()
        emit(artistList)
    }

}