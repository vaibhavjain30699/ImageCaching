package com.vaibhav.imagecaching.data

import com.vaibhav.imagecaching.viewmodel.ImageUI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

interface ImageRepository {
    fun fetchImagesList(): Flow<Result<List<ImageUI>>>
}

class ImageRepositoryImpl(
    private val retrofit: RetrofitInstance,
) : ImageRepository {
    override fun fetchImagesList(): Flow<Result<List<ImageUI>>> = flow {
        emit(Result.Loading)
        try {
            val response = retrofit.imageAPI.getImages().map { ImageUI.fromJSON(it) }
            emit(Result.Success(response))
        } catch (e: Exception) {
            emit(Result.Error(e))
        }
    }.flowOn(Dispatchers.IO)
}