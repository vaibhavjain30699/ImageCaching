package com.vaibhav.imagecaching.viewmodel

import androidx.lifecycle.ViewModel
import com.vaibhav.imagecaching.data.ImageRepository
import kotlinx.coroutines.flow.MutableStateFlow

interface ImageViewModel {
    val state: MutableStateFlow<ImageState>
    fun fetchImages()
}

class ImageViewModelImpl(
    private val repository: ImageRepository,
) : ImageViewModel, ViewModel() {

    override val state: MutableStateFlow<ImageState> = MutableStateFlow(ImageState())

    override fun fetchImages() {

    }
}