package com.appdevgenie.movie_db_kotlin.data.model.tvshow


import com.appdevgenie.movie_db_kotlin.data.model.tvshow.TvShow
import com.google.gson.annotations.SerializedName

data class TvShowList(

    @SerializedName("results")
    val tvShows: List<TvShow>
)