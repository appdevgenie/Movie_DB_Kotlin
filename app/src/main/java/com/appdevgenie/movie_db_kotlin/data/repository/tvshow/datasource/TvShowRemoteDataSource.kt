package com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasource

import com.appdevgenie.movie_db_kotlin.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {

    suspend fun getTvShows(): Response<TvShowList>
}