package com.example.model.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiManager {
    companion object{
        val BASE_URL="https://howtodoandroid.com/movielist.json"
        val retrofit = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(
            BASE_URL).build()
    }
}