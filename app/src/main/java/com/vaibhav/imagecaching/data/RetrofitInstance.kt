package com.vaibhav.imagecaching.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val imageAPI: ImageAPI by lazy {
        Retrofit.Builder()
            .baseUrl("https://acharyaprashant.org/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ImageAPI::class.java)
    }
}