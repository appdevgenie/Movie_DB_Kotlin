package com.appdevgenie.movie_db_kotlin.data.repository.tvshow

import android.content.ContentValues
import android.util.Log
import com.appdevgenie.movie_db_kotlin.data.model.tvshow.TvShow
import com.appdevgenie.movie_db_kotlin.data.model.tvshow.TvShowList
import com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.appdevgenie.movie_db_kotlin.domain.repository.TvShowRepository
import retrofit2.Response

class TvShowRepositoryImpl(
    private val tvShowRemoteDataSource: TvShowRemoteDataSource,
    private val tvShowLocalDataSource: TvShowLocalDataSource,
    private val tvShowCacheDataSource: TvShowCacheDataSource
):TvShowRepository {

    override suspend fun getTvShows(): List<TvShow>? {
        return getTvShowsFromCache()
    }

    override suspend fun updateTvShows(): List<TvShow>? {
        val newListOfTvShows:List<TvShow> = getTvShowsFromAPI()
        tvShowLocalDataSource.clearAll()
        tvShowLocalDataSource.saveTvShowsToDB(newListOfTvShows)
        tvShowCacheDataSource.saveTvShowsToCache(newListOfTvShows)
        return newListOfTvShows
    }

    suspend fun getTvShowsFromAPI():List<TvShow>{
        lateinit var tvShowList:List<TvShow>

        try {
            val response: Response<TvShowList> = tvShowRemoteDataSource.getTvShows()
            val body: TvShowList? = response.body()
            if(body!= null){
                tvShowList = body.tvShows
            }
        }catch (exception:Exception){
            Log.i(ContentValues.TAG, "getTvShowsFromAPI: exception")
        }

        return tvShowList
    }

    suspend fun getTvShowsFromDB():List<TvShow>{
        lateinit var tvShowList:List<TvShow>

        try {
            tvShowList = tvShowLocalDataSource.getTvShowsFromDB()
        }catch (exception:Exception){
            Log.i(ContentValues.TAG, "getTvShowsFromDB: exception")
        }

        if(tvShowList.size > 0){
            return tvShowList
        }else{
            tvShowList = getTvShowsFromAPI()
            tvShowLocalDataSource.saveTvShowsToDB(tvShowList)
        }
        return tvShowList
    }

    suspend fun getTvShowsFromCache():List<TvShow>{
        lateinit var tvShowList:List<TvShow>

        try {
            tvShowList = tvShowCacheDataSource.getTvShowsFromCache()
        }catch (exception:Exception){
            Log.i(ContentValues.TAG, "getMoviesFromCache: exception")
        }

        if(tvShowList.size > 0){
            return tvShowList
        }else{
            tvShowList = getTvShowsFromDB()
            tvShowCacheDataSource.saveTvShowsToCache(tvShowList)
        }
        return tvShowList
    }
}