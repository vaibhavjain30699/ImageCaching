package com.vaibhav.imagecaching.data

import retrofit2.http.GET
import retrofit2.http.Query

interface ImageAPI {
    @GET("content/misc/media-coverages?")
    suspend fun getImages(@Query("limit") limit: Int = 100): List<ImageObject>
}