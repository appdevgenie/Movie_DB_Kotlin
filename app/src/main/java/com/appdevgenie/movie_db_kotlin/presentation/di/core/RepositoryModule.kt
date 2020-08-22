package com.appdevgenie.movie_db_kotlin.presentation.di.core


import com.appdevgenie.movie_db_kotlin.data.repository.artist.ArtistRepositoryImpl
import com.appdevgenie.movie_db_kotlin.data.repository.artist.datasource.ArtistCacheDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.artist.datasource.ArtistLocalDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.artist.datasource.ArtistRemoteDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.movie.MovieRepositoryImpl
import com.appdevgenie.movie_db_kotlin.data.repository.movie.datasource.MovieCacheDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.movie.datasource.MovieLocalDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.movie.datasource.MovieRemoteDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.tvshow.TvShowRepositoryImpl
import com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.appdevgenie.movie_db_kotlin.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.appdevgenie.movie_db_kotlin.domain.repository.ArtistRepository
import com.appdevgenie.movie_db_kotlin.domain.repository.MovieRepository
import com.appdevgenie.movie_db_kotlin.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDataSource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDataSource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )


    }

}