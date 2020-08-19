package com.appdevgenie.movie_db_kotlin.domain.usecase

import com.appdevgenie.movie_db_kotlin.data.model.movie.Movie
import com.appdevgenie.movie_db_kotlin.domain.repository.MovieRepository

class UpdateMovieUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}