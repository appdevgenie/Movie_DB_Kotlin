package com.appdevgenie.movie_db_kotlin.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.appdevgenie.movie_db_kotlin.data.model.tvshow.TvShow

@Dao
interface TvShowDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTvShows(tvShow: List<TvShow>)

    @Query("DELETE FROM popular_tvShows")
    suspend fun deleteAlltvShows()

    @Query("SELECT * FROM popular_tvShows")
    suspend fun getTvShows(tvShow: List<TvShow>)
}