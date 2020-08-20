package com.appdevgenie.movie_db_kotlin.data.repository.tvshow

import com.appdevgenie.movie_db_kotlin.data.model.tvshow.TvShow
import com.appdevgenie.movie_db_kotlin.domain.repository.TvShowRepository

class TvShowRepositoryImpl():TvShowRepository {

    override suspend fun getTvShows(): List<TvShow>? {
        TODO("Not yet implemented")
    }

    override suspend fun updateTvShows(): List<TvShow>? {
        TODO("Not yet implemented")
    }
}