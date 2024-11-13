package com.vaibhav.imagecaching.data

import com.google.gson.annotations.SerializedName

data class ImageObject(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("language")
    val language: String? = null,
    @SerializedName("thumbnail")
    val thumbnail: Thumbnail? = Thumbnail(),
    @SerializedName("mediaType")
    val mediaType: Int? = null,
    @SerializedName("coverageURL")
    val coverageURL: String? = null,
    @SerializedName("publishedAt")
    val publishedAt: String? = null,
    @SerializedName("publishedBy")
    val publishedBy: String? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("seoSlugWithId")
    val seoSlugWithId: String? = null
)

data class Thumbnail(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("version")
    val version: Int? = null,
    @SerializedName("domain")
    val domain: String? = null,
    @SerializedName("basePath")
    val basePath: String? = null,
    @SerializedName("key")
    val key: String? = null,
    @SerializedName("qualities")
    val qualities: ArrayList<Int> = arrayListOf(),
    @SerializedName("aspectRatio")
    val aspectRatio: Double? = null
)