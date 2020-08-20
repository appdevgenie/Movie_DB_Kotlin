package com.appdevgenie.movie_db_kotlin.data.repository.movie.datasourceimpl

import com.appdevgenie.movie_db_kotlin.data.model.movie.Movie
import com.appdevgenie.movie_db_kotlin.data.repository.movie.datasource.MovieCacheDataSource

class MovieCacheDataSourceImpl:
    MovieCacheDataSource {

    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
}