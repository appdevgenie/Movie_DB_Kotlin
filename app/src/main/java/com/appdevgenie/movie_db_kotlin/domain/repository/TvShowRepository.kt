package com.appdevgenie.movie_db_kotlin.domain.repository

import com.appdevgenie.movie_db_kotlin.data.model.tvshow.TvShow

interface TvShowRepository {

    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}