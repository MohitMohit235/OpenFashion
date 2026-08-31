package com.example.project30.presentation.explorenew.explorenewcommponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project30.R

@Composable
fun NewCollectionCard(lists:Lists) {
    val font = FontFamily(Font(R.font.tenorsans))
    
    Column(
            modifier = Modifier.fillMaxWidth().padding(10.dp)
    ) {
        Box(
                contentAlignment = Alignment.BottomEnd,
                modifier = Modifier.padding(2.dp)
        ) {
            Image(
                    painter = lists.images,
                    contentDescription = null,
                    modifier = Modifier
                            .fillMaxSize()
                            .size(270.dp)
                            .clip(
                                    shape = RoundedCornerShape(1.dp)
                            ),
                    contentScale = ContentScale.Crop
            )
            
            Icon(
                    painter = painterResource(R.drawable.heart),
                    contentDescription = null,
                    tint = Color(0xFFDD8560),
                    modifier = Modifier.padding(8.dp)
            )
            
        }
        Text(
                text = lists.title,
                fontFamily = font,
                fontSize = 12.sp,
                color = Color.Black,
        )
        Text(
                text = lists.desc,
                fontFamily = font,
                fontSize = 12.sp,
                color = Color.Black,
        )
        Text(
                text = "$${lists.price}",
                fontFamily = font,
                fontSize = 12.sp,
                color = Color(0xFFDD8560)
        )
    }
}