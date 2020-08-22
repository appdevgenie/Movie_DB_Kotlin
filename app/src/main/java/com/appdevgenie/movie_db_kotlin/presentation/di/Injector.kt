package com.appdevgenie.movie_db_kotlin.presentation.di

import com.appdevgenie.movie_db_kotlin.presentation.di.artist.ArtistSubComponent
import com.appdevgenie.movie_db_kotlin.presentation.di.movie.MovieSubComponent
import com.appdevgenie.movie_db_kotlin.presentation.di.tvshow.TvShowSubComponent


interface Injector {
   fun createMovieSubComponent(): MovieSubComponent
   fun createTvShowSubComponent(): TvShowSubComponent
   fun createArtistSubComponent(): ArtistSubComponent
}