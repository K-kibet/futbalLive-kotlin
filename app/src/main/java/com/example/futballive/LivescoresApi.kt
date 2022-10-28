package com.example.futballive

import retrofit2.Call
import retrofit2.http.GET


interface LivescoresApi {
    @GET("/football/?met=Livescore&APIkey=8859625bd594b254542534e009ae3e9ce12cf3662ac436b139fd475f843819fa")
    fun getData(): Call<List<LivescoresDataItem>>
}