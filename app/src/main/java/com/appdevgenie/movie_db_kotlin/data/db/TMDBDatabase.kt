package com.appdevgenie.movie_db_kotlin.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.appdevgenie.movie_db_kotlin.data.model.artist.Artist
import com.appdevgenie.movie_db_kotlin.data.model.movie.Movie
import com.appdevgenie.movie_db_kotlin.data.model.tvshow.TvShow

@Database(entities = [Movie::class, TvShow::class, Artist::class], version = 1, exportSchema = false)
abstract class TMDBDatabase : RoomDatabase() {
    
    abstract fun movieDao(): MovieDao
    abstract fun tvShowDao(): TvShowDao
    abstract fun artistDao(): ArtistDao


}