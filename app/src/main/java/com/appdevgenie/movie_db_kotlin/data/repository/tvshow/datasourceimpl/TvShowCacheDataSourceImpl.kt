package com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasourceimpl

import com.appdevgenie.movie_db_kotlin.data.model.tvshow.TvShow
import com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasource.TvShowCacheDataSource

class TvShowCacheDataSourceImpl: TvShowCacheDataSource {

    private var tvShowList = ArrayList<TvShow>()

    override suspend fun getTvShowsFromCache(): List<TvShow> {
        return tvShowList
    }

    override suspend fun saveTvShowsToCache(tvShows: List<TvShow>) {
        tvShowList.clear()
        tvShowList = ArrayList(tvShows)
    }
}