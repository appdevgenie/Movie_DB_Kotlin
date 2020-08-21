package com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasourceimpl

import com.appdevgenie.movie_db_kotlin.data.api.TMDBService
import com.appdevgenie.movie_db_kotlin.data.model.tvshow.TvShowList
import com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
): TvShowRemoteDataSource
{
    override suspend fun getTvShows(): Response<TvShowList> {
        return tmdbService.getPopularTvShows(apiKey)
    }
}