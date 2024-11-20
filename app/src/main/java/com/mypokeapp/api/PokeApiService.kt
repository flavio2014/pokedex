package com.mypokeapp.api

import androidx.compose.ui.geometry.Offset
import com.mypokeapp.models.PokemonListResponse
import com.mypokeapp.models.PokemonDetails
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface  PokeApiService {
    @GET("pokemon")
    fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int,
    ): Call<PokemonListResponse>

    @GET("pokemon/{id}")
    fun getPokemonDetails(@Path("id") id: Int): Call<PokemonDetails>

    @GET("pokemon/{name}")
    fun getPokemonByName(@Path("name") name: String): Call<PokemonDetails>
}