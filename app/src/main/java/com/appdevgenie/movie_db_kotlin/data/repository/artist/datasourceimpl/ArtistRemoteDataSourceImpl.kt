package com.appdevgenie.movie_db_kotlin.data.repository.artist.datasourceimpl

import com.appdevgenie.movie_db_kotlin.data.api.TMDBService
import com.appdevgenie.movie_db_kotlin.data.model.artist.ArtistList
import com.appdevgenie.movie_db_kotlin.data.repository.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
): ArtistRemoteDataSource{

    override suspend fun getArtists(): Response<ArtistList> {
        return tmdbService.getPopularArtist(apiKey)
    }
}