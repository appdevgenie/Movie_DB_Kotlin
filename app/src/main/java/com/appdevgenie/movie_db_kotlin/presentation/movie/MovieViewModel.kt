package com.appdevgenie.movie_db_kotlin.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.appdevgenie.movie_db_kotlin.domain.usecase.GetMoviesUseCase
import com.appdevgenie.movie_db_kotlin.domain.usecase.UpdateMovieUseCase


class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUsecase: UpdateMovieUseCase
): ViewModel() {

    fun getMovies() = liveData {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData {
        val movieList = updateMoviesUsecase.execute()
        emit(movieList)
    }

    }





