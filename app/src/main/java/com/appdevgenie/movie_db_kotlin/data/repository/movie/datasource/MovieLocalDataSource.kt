package com.appdevgenie.movie_db_kotlin.data.repository.movie.datasource

import com.appdevgenie.movie_db_kotlin.data.model.movie.Movie

interface MovieLocalDataSource {

    suspend fun getMoviesFromDB():List<Movie>
    suspend fun saveMoviesToDB(movies:List<Movie>)
    suspend fun clearAll()
}