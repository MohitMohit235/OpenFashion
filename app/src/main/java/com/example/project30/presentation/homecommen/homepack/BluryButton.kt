package com.example.project30.presentation.homecommen.homepack

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project30.R

@Composable
fun ExploreCollectionButton(
        text: String = "EXPLORE COLLECTION",
        onClick: () -> Unit
) {
    
    val font2 = FontFamily(Font(R.font.tenorsans))
    
    Box(
            modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .background(Color.Black.copy(alpha = 0.35f))
                    .blur(0.5.dp)
                    .clickable { onClick() }
                    .padding(horizontal = 32.dp, vertical = 14.dp)
    ) {
        Text(
                text = text,
                color = Color.White,
                fontSize = 14.sp,
                fontFamily = font2,
                letterSpacing = 2.sp,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.Center)
        )
    }
}