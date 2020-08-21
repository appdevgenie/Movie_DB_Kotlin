package com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasource

import com.appdevgenie.movie_db_kotlin.data.model.tvshow.TvShow

interface TvShowCacheDataSource {

    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShows:List<TvShow>)
}