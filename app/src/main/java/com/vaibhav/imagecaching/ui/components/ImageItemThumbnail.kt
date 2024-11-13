package com.vaibhav.imagecaching.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.vaibhav.imagecaching.R

@Composable
fun ImageItemThumbnail(
    bitmap: ImageBitmap? = null,
    title: String,
) {
    val bitmap1 = painterResource(R.drawable.ic_launcher_background)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(bitmap1, contentDescription = null)
        Text(title, textAlign = TextAlign.Center)
    }
}