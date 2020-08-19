package com.appdevgenie.movie_db_kotlin.domain.usecase

import com.appdevgenie.movie_db_kotlin.data.model.tvshow.TvShow
import com.appdevgenie.movie_db_kotlin.domain.repository.TvShowRepository

class GetTvShowUseCase (private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>? = tvShowRepository.getTvShows()
}