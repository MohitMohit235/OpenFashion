package com.example.project30.presentation.explorecollection.explorecommponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project30.R

@Composable
fun CollectionCard(lists: Lists) {
    val font = FontFamily(Font(R.font.tenorsans))
    Column(
            modifier = Modifier
                    .fillMaxWidth()
    ) {
        Box(
                contentAlignment = Alignment.BottomCenter
        ) {
            Image(
                    painter = lists.images,
                    contentDescription = null,
                    modifier = Modifier
                            .fillMaxSize()
                            .size(500.dp)
                            .clip(
                                    shape = RoundedCornerShape(1.dp)
                            ),
                    contentScale = ContentScale.Crop
            )
            Box(
                    contentAlignment = Alignment.BottomCenter,
                    modifier = Modifier.background(
                            brush = Brush.verticalGradient(
                                    colors = listOf(
                                            Color.Transparent,
                                            Color.Black,
                                    )
                            )
                    )
                            .fillMaxWidth()
                            .height(300.dp)
            ) {
                Text(
                        text = lists.name,
                        fontFamily = font,
                        fontSize = 25.sp,
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 20.dp)
                )
            }
        }
    }
}