package com.appdevgenie.movie_db_kotlin.presentation.di.core


import com.appdevgenie.movie_db_kotlin.presentation.di.artist.ArtistSubComponent
import com.appdevgenie.movie_db_kotlin.presentation.di.movie.MovieSubComponent
import com.appdevgenie.movie_db_kotlin.presentation.di.tvshow.TvShowSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NetModule::class,
        DataBaseModule::class,
        UseCaseModule::class,
        RepositoryModule::class,
        RemoteDataModule::class,
        LocalDataModule::class,
        CacheDataModule::class
    ]
)
interface AppComponent {

    fun movieSubComponent(): MovieSubComponent.Factory
    fun tvShowSubComponent(): TvShowSubComponent.Factory
    fun artistSubComponent(): ArtistSubComponent.Factory

}