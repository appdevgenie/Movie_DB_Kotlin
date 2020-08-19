package com.appdevgenie.movie_db_kotlin.domain.repository

import com.appdevgenie.movie_db_kotlin.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?
}