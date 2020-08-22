package com.appdevgenie.movie_db_kotlin.presentation.di.tvshow


import com.appdevgenie.movie_db_kotlin.domain.usecase.GetTvShowUseCase
import com.appdevgenie.movie_db_kotlin.domain.usecase.UpdateTvShowUseCase
import com.appdevgenie.movie_db_kotlin.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowUseCase,
        updateTvShowsUseCase: UpdateTvShowUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}