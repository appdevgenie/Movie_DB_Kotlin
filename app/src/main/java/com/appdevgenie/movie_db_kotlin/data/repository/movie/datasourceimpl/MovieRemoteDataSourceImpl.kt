package com.appdevgenie.movie_db_kotlin.data.repository.movie.datasourceimpl

import com.appdevgenie.movie_db_kotlin.data.api.TMDBService
import com.appdevgenie.movie_db_kotlin.data.model.movie.MovieList
import com.appdevgenie.movie_db_kotlin.data.repository.movie.datasource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : MovieRemoteDataSource {

    override suspend fun getMovies(): Response<MovieList> {
        return tmdbService.getPopularMovies(apiKey)
    }

}