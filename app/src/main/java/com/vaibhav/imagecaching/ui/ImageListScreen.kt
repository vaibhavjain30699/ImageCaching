package com.vaibhav.imagecaching.ui

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import com.vaibhav.imagecaching.ui.components.ImageItemThumbnail
import com.vaibhav.imagecaching.viewmodel.ImageUI

@Composable
fun ImageListScreen(
    images: List<ImageUI>
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3)
    ) {
        items(images) {
            ImageItemThumbnail(
                title = it.title
            )
        }
    }
}