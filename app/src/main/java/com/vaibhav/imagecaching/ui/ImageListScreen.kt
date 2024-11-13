package com.vaibhav.imagecaching.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vaibhav.imagecaching.data.Result
import com.vaibhav.imagecaching.ui.components.ImageItemThumbnail
import com.vaibhav.imagecaching.viewmodel.ImageViewModel

@Composable
fun ImageListScreen(
    viewModel: ImageViewModel,
) {
    val state = viewModel.state.collectAsState()

    Scaffold { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            state.value.images?.let {
                when (it) {
                    is Result.Loading -> {
                        CircularProgressIndicator(
                            modifier = Modifier
                                .height(32.dp)
                                .width(32.dp)
                        )
                    }

                    is Result.Success -> {
                        LazyVerticalGrid(
                            modifier = Modifier.fillMaxSize(),
                            columns = GridCells.Fixed(count = 3),
                            horizontalArrangement = Arrangement.Center,
                            verticalArrangement = Arrangement.Center
                        ) {
                            val list = it.data
                            items(list) { image ->
                                ImageItemThumbnail(title = image.title)
                            }
                        }
                    }

                    is Result.Error -> {
                        ElevatedButton(
                            onClick = viewModel::onRetry,
                            content = {
                                Text("Error")
                            }
                        )
                    }
                }
            }
        }
    }
}