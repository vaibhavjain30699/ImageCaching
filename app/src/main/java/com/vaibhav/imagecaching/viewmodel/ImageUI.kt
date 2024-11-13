package com.vaibhav.imagecaching.viewmodel

import com.vaibhav.imagecaching.data.ImageObject

data class ImageUI(
    val id: String,
    val title: String,
    val imageURL: String,
) {
    companion object {
        fun fromJSON(imageObject: ImageObject): ImageUI {
            return ImageUI(
                id = imageObject.id,
                title = imageObject.title,
                imageURL = imageObject.thumbnail.domain + "/" +
                        imageObject.thumbnail.basePath + "/0/" + imageObject.thumbnail.key
            )
        }
    }
}
