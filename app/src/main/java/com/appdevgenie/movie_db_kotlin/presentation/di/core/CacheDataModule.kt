package com.appdevgenie.movie_db_kotlin.presentation.di.core


import com.appdevgenie.movie_db_kotlin.data.repository.artist.datasource.ArtistCacheDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.artist.datasourceimpl.ArtistCacheDataSourceImpl
import com.appdevgenie.movie_db_kotlin.data.repository.movie.datasource.MovieCacheDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.movie.datasourceimpl.MovieCacheDataSourceImpl
import com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasourceimpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }


}