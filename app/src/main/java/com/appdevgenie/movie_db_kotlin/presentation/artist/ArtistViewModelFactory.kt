package com.appdevgenie.movie_db_kotlin.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.appdevgenie.movie_db_kotlin.domain.usecase.GetArtistUseCase
import com.appdevgenie.movie_db_kotlin.domain.usecase.UpdateArtistUseCase


class ArtistViewModelFactory(
    private val getArtistsUseCase: GetArtistUseCase,
    private val updateArtistsUseCase: UpdateArtistUseCase
):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ArtistViewModel(
            getArtistsUseCase,
            updateArtistsUseCase
        ) as T
    }
}