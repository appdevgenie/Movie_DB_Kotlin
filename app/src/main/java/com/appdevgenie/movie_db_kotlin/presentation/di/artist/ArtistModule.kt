package com.appdevgenie.movie_db_kotlin.presentation.di.artist


import com.appdevgenie.movie_db_kotlin.domain.usecase.GetArtistUseCase
import com.appdevgenie.movie_db_kotlin.domain.usecase.UpdateArtistUseCase
import com.appdevgenie.movie_db_kotlin.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistUseCase,
        updateArtistsUseCase: UpdateArtistUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }

}