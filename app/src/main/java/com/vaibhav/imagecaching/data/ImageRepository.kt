package com.vaibhav.imagecaching.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

interface ImageRepository {
    fun fetchImages(): Flow<Result<List<ImageObject>>>
}

class ImageRepositoryImpl(
    private val retrofit: RetrofitInstance,
) : ImageRepository {
    override fun fetchImages(): Flow<Result<List<ImageObject>>> = flow {
        emit(Result.Loading)
        try {
            val response = retrofit.imageAPI.getImages()
            emit(Result.Success(response))
        } catch (e: Exception) {
            emit(Result.Error(e))
        }
    }.flowOn(Dispatchers.IO)
}