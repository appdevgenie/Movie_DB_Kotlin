package com.appdevgenie.movie_db_kotlin.presentation.tv

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.appdevgenie.movie_db_kotlin.domain.usecase.GetTvShowUseCase
import com.appdevgenie.movie_db_kotlin.domain.usecase.UpdateTvShowUseCase


class TvShowViewModel(
    private val getTvShowsUseCase: GetTvShowUseCase,
    private val updateTvShowsUseCase: UpdateTvShowUseCase
) : ViewModel() {

 fun getTvShows() = liveData {
     val tvShowList = getTvShowsUseCase.execute()
     emit(tvShowList)
 }

 fun updateTvShows() = liveData {
     val tvShowList = updateTvShowsUseCase.execute()
     emit(tvShowList)
 }
}
