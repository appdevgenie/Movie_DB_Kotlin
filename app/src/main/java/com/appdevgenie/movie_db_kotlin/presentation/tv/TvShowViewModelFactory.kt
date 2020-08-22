package com.appdevgenie.movie_db_kotlin.presentation.tv

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.appdevgenie.movie_db_kotlin.domain.usecase.GetTvShowUseCase
import com.appdevgenie.movie_db_kotlin.domain.usecase.UpdateTvShowUseCase


class TvShowViewModelFactory(
    private val getTvShowsUseCase: GetTvShowUseCase,
    private val updateTvShowsUseCase: UpdateTvShowUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TvShowViewModel(
            getTvShowsUseCase,
            updateTvShowsUseCase
        ) as T
    }
}