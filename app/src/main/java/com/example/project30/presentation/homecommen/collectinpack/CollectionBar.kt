package com.example.project30.presentation.homecommen.collectinpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project30.R

@Composable
fun CollectionBar() {
    val font = FontFamily(Font(R.font.tenorsans))
    Column(
            modifier = Modifier
                    .padding(top = 40.dp)
                    .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
                text = "COLLECTIONS",
                fontFamily = font,
                fontSize = 18.sp,
                letterSpacing = 4.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black
        )
        Spacer(modifier = Modifier.height(25.dp))
        Column(
                horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                    modifier = Modifier
                            .size(width = 430.dp, height = 250.dp),
                    painter = painterResource(R.drawable.image10),
                    contentDescription = null,
                    contentScale = ContentScale.Fit
            )
            
            Spacer(modifier = Modifier.height(25.dp))
            
            Image(
                    modifier = Modifier
                            .size(350.dp),
                    painter = painterResource(R.drawable.image11),
                    contentDescription = null
            )
        }
        
        Spacer(modifier = Modifier.height(25.dp))
        
        BrandVideo()
    }
}