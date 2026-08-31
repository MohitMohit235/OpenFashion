package com.example.project30.presentation.homecommen.followpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project30.R

@Composable
fun FollowBar() {
    val font = FontFamily(Font(R.font.tenorsans))
    Box(
            modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 50.dp)
    ) {
        Column(
                modifier = Modifier
                        .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Text(
                    text = "FOLLOW US",
                    fontFamily = font,
                    fontSize = 18.sp,
                    letterSpacing = 3.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black
            )
          
            Spacer(modifier = Modifier.height(30.dp))
            
            Column(
                    modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 15.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    imageBox(
                            image = painterResource(R.drawable.foll1),
                            name = "@_mia"
                    )
                    imageBox(
                            image = painterResource(R.drawable.foll2),
                            name = "@_jihyn"
                    )
                }
                
                
                Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    imageBox(
                            image = painterResource(R.drawable.foll3),
                            name = "@tome"
                    )
                    imageBox(
                            image = painterResource(R.drawable.foll4),
                            name = "@_hemer"
                    )
                }
                Spacer(modifier = Modifier.height(50.dp))
                Row(
                        modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 100.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    
                    Icon(
                            painter = painterResource(R.drawable.twittersolid),
                            contentDescription = null,
                            tint = Color.Black,
                            modifier = Modifier.size(30.dp)
                    )
                    
                    Icon(
                            painter = painterResource(R.drawable.instagramsolid),
                            contentDescription = null,
                            tint = Color.Black,
                            modifier = Modifier.size(30.dp)
                    )
                    
                    
                    Icon(
                            painter = painterResource(R.drawable.youtubesolid),
                            tint = Color.Black,
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                    )
                }
                Text(
                        text = "Copyright© OpenUI All Rights Reserved.",
                        fontFamily = font,
                        color = Color.Black,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center
                )
                
            }
        }
    }
}

@Composable
fun imageBox(
        image: Painter,
        name: String,
) {
    val font = FontFamily(Font(R.font.tenorsans))
    Box(
            modifier = Modifier.size(184.dp),
            contentAlignment = Alignment.BottomStart
    ) {
        Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier.fillMaxSize()
        )
        Box(
                modifier = Modifier
                        .fillMaxWidth()
                        .background(
                                brush = Brush.verticalGradient(
                                        colors = listOf(
                                                Color.Transparent,
                                                Color.Black
                                        )
                                )
                        )
        ) {
            Text(
                    text = name,
                    fontFamily = font,
                    fontSize = 14.sp,
                    color = Color.White,
                    modifier = Modifier
                            .padding(9.dp)
            
            )
        }
    }
}