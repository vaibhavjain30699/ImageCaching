package com.vaibhav.imagecaching.viewmodel

import com.vaibhav.imagecaching.data.Result

data class ImageState(
    val images: Result<List<ImageUI>>? = null
)
