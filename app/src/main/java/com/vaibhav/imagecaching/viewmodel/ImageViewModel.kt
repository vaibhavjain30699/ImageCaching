package com.vaibhav.imagecaching.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vaibhav.imagecaching.data.ImageRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

interface ImageViewModel {
    val state: MutableStateFlow<ImageState>
    fun fetchImages()
    fun onRetry()
}

class ImageViewModelImpl(
    private val repository: ImageRepository,
) : ImageViewModel, ViewModel() {

    override val state: MutableStateFlow<ImageState> = MutableStateFlow(ImageState())

    init {
        fetchImages()
    }

    override fun fetchImages() {
        viewModelScope.launch {
            repository.fetchImagesList().collect { imagesList ->
                state.update {
                    it.copy(
                        images = imagesList
                    )
                }
            }
        }
    }

    override fun onRetry() {
        fetchImages()
    }
}