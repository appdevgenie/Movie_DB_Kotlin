package com.appdevgenie.movie_db_kotlin.data.model.artist


import com.appdevgenie.movie_db_kotlin.data.model.artist.Artist
import com.google.gson.annotations.SerializedName

data class ArtistList(

    @SerializedName("results")
    val artists: List<Artist>
)