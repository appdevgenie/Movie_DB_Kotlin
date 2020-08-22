package com.appdevgenie.movie_db_kotlin.presentation.di.core


import com.appdevgenie.movie_db_kotlin.data.db.ArtistDao
import com.appdevgenie.movie_db_kotlin.data.db.MovieDao
import com.appdevgenie.movie_db_kotlin.data.db.TvShowDao
import com.appdevgenie.movie_db_kotlin.data.repository.artist.datasource.ArtistLocalDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.artist.datasourceimpl.ArtistLocalDataSourceImpl
import com.appdevgenie.movie_db_kotlin.data.repository.movie.datasource.MovieLocalDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.movie.datasourceimpl.MovieLocalDataSourceImpl
import com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasourceimpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }


}