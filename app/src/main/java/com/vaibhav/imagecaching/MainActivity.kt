package com.vaibhav.imagecaching

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.vaibhav.imagecaching.data.ImageRepositoryImpl
import com.vaibhav.imagecaching.data.RetrofitInstance
import com.vaibhav.imagecaching.ui.ImageListScreen
import com.vaibhav.imagecaching.ui.theme.ImageCachingTheme
import com.vaibhav.imagecaching.viewmodel.ImageViewModel
import com.vaibhav.imagecaching.viewmodel.ImageViewModelFactory

class MainActivity : ComponentActivity() {

    private val repository = ImageRepositoryImpl(RetrofitInstance)
    private val imageViewModel: ImageViewModel by viewModels {
        ImageViewModelFactory(repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImageCachingTheme {
                ImageListScreen(imageViewModel)
            }
        }
    }
}