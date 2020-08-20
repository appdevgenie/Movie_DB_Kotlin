package com.appdevgenie.movie_db_kotlin.data.repository.movie.datasource

import com.appdevgenie.movie_db_kotlin.data.model.movie.Movie

interface MovieCacheDataSource {

    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies:List<Movie>)
}