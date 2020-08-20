package com.appdevgenie.movie_db_kotlin.data.repository.movie.datasource

import com.appdevgenie.movie_db_kotlin.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {

    suspend fun getMovies(): Response<MovieList>
}