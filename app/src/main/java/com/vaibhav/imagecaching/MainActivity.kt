package com.vaibhav.imagecaching

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.vaibhav.imagecaching.ui.ImageListScreen
import com.vaibhav.imagecaching.ui.theme.ImageCachingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImageCachingTheme {
                ImageListScreen(
                    emptyList()
                )
            }
        }
    }
}