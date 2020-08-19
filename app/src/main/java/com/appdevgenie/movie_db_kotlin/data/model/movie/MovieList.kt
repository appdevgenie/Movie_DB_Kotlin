package com.appdevgenie.movie_db_kotlin.data.model.movie


import com.appdevgenie.movie_db_kotlin.data.model.movie.Movie
import com.google.gson.annotations.SerializedName

data class MovieList(

    @SerializedName("results")
    val movies: List<Movie>

    )