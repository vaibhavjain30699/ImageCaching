package com.vaibhav.imagecaching.data

import com.google.gson.annotations.SerializedName

data class ImageObject(
    @SerializedName("id")
    val id: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("language")
    val language: String,
    @SerializedName("thumbnail")
    val thumbnail: Thumbnail,
    @SerializedName("mediaType")
    val mediaType: Int,
    @SerializedName("coverageURL")
    val coverageURL: String,
    @SerializedName("publishedAt")
    val publishedAt: String,
    @SerializedName("publishedBy")
    val publishedBy: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("seoSlugWithId")
    val seoSlugWithId: String
)

data class Thumbnail(
    @SerializedName("id")
    val id: String,
    @SerializedName("version")
    val version: Int,
    @SerializedName("domain")
    val domain: String,
    @SerializedName("basePath")
    val basePath: String,
    @SerializedName("key")
    val key: String,
    @SerializedName("qualities")
    val qualities: ArrayList<Int>,
    @SerializedName("aspectRatio")
    val aspectRatio: Double
)