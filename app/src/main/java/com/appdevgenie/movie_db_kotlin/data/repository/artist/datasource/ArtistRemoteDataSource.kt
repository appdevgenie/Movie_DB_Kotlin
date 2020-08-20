package com.appdevgenie.movie_db_kotlin.data.repository.artist.datasource

import com.appdevgenie.movie_db_kotlin.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {

    suspend fun getArtists(): Response<ArtistList>
}