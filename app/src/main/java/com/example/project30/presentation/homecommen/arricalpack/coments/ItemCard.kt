package com.example.project30.presentation.homecommen.arricalpack.coments

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project30.R


@Composable
fun Card(
        items: Items
) {
    val font = FontFamily(Font(R.font.tenorsans))
    
    Box(
            modifier = Modifier
                    .width(180.dp)
    ){
        Column(
                modifier = Modifier
                        .fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                    modifier = Modifier.size(200.dp),
                    painter = items.image,
                    contentDescription = null,
                    contentScale = ContentScale.Crop
            )
            
            Spacer(modifier = Modifier.height(5.dp))
            
            Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                        text = items.title,
                        color = Color.Black,
                        fontFamily = font,
                        lineHeight = 13.sp,
                        fontSize = 12.sp,
                        minLines = 2,
                        textAlign = TextAlign.Center
                )
                
                Text(
                        text = "$${items.price}",
                        fontFamily = font,
                        fontSize = 15.sp,
                        color = Color(0xFFDD8560),
                )
            }
        }
    }
}


