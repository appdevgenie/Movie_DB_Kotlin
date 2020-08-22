package com.appdevgenie.movie_db_kotlin.presentation.di.core


import com.appdevgenie.movie_db_kotlin.data.api.TMDBService
import com.appdevgenie.movie_db_kotlin.data.repository.artist.datasource.ArtistRemoteDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.artist.datasourceimpl.ArtistRemoteDataSourceImpl
import com.appdevgenie.movie_db_kotlin.data.repository.movie.datasource.MovieRemoteDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.movie.datasourceimpl.MovieRemoteDataSourceImpl
import com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasourceimpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideTvRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDataSource {
        return TvShowRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDataSource {
        return ArtistRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }


}