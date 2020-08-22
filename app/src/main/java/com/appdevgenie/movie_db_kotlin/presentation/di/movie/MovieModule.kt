package com.appdevgenie.movie_db_kotlin.presentation.di.movie


import com.appdevgenie.movie_db_kotlin.domain.usecase.GetMoviesUseCase
import com.appdevgenie.movie_db_kotlin.domain.usecase.UpdateMovieUseCase
import com.appdevgenie.movie_db_kotlin.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMovieUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}