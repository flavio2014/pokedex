package com.mypokeapp.api

import com.mypokeapp.models.Pokemon
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private  const val BASE_URL = "https://pokeapi.co/api/v2/"

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(OkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiService: PokeApiService  by lazy {
        retrofit.create(PokeApiService::class.java)
    }
}