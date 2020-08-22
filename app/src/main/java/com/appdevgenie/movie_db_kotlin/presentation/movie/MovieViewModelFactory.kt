package com.appdevgenie.movie_db_kotlin.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.appdevgenie.movie_db_kotlin.domain.usecase.GetMoviesUseCase
import com.appdevgenie.movie_db_kotlin.domain.usecase.UpdateMovieUseCase


class MovieViewModelFactory(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUsecase: UpdateMovieUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MovieViewModel(getMoviesUseCase,updateMoviesUsecase) as T
    }
}

