package com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasource

import com.appdevgenie.movie_db_kotlin.data.model.movie.Movie
import com.appdevgenie.movie_db_kotlin.data.model.tvshow.TvShow

interface TvShowLocalDataSource {

    suspend fun getTvShowsFromDB():List<TvShow>
    suspend fun saveTvShowsToDB(tvShows:List<TvShow>)
    suspend fun clearAll()
}