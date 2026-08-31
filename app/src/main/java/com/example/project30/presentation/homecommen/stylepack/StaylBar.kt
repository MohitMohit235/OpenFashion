package com.example.project30.presentation.homecommen.stylepack

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalGridApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project30.R

@OptIn(ExperimentalGridApi::class)
@Preview
@Composable
fun StyleBar() {
    val font = FontFamily(Font(R.font.tenorsans))
    val itm = listOf(
            "ok",
            "om",
            "sam",
            "come"
    )
    
    
    Box(
            modifier = Modifier
                    .padding(top = 50.dp)
                    .background(color = Color(0xFFF0F0F0))
    ) {
        Column(
                modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 15.dp),
                horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier.size(110.dp)
            )
            
            Text(
                    text = "Making a luxurious lifestyle accessible for a generous group of women is our daily drive.",
                    textAlign = TextAlign.Center,
                    fontFamily = font,
                    lineHeight = 20.sp,
                    fontSize = 16.sp,
                    color = Color.DarkGray,
                    maxLines = 3,
                    modifier = Modifier.width(260.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                    painter = painterResource(R.drawable._3),
                    contentDescription = null,
            )
            
            GridItems()
            
            Spacer(modifier = Modifier.height(16.dp))
            
            Image(
                    painter = painterResource(R.drawable.wiresvg),
                    contentDescription = null,
                    modifier = Modifier
                            .size(80.dp)
            )
        }
    }
}

@Composable
fun GridItems() {
    val font = FontFamily(Font(R.font.tenorsans))
    Column(
            modifier = Modifier
                    .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.width(165.dp),
                    verticalArrangement = Arrangement.spacedBy(6.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
            ){
                Icon(
                        painter = painterResource(R.drawable.style1),
                        contentDescription = null,
                        tint = Color.Black,
                        modifier = Modifier.size(60.dp)
                )
                Text(
                        text = "Fast shipping. Free on orders over \$25.",
                        fontFamily = font,
                        color = Color.Black,
                        fontSize = 13.sp,
                        textAlign = TextAlign.Center
                )
            }
            
            Column(
                    modifier = Modifier.width(165.dp),
                    verticalArrangement = Arrangement.spacedBy(6.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
            ){
                Icon(
                        painter = painterResource(R.drawable.style2),
                        contentDescription = null,
                        tint = Color.Black,
                        modifier = Modifier.size(60.dp)
                )
                Text(
                        text = "Sustainable process \n" +
                                "from start to finish.",
                        fontFamily = font,
                        color = Color.Black,
                        fontSize = 13.sp,
                        textAlign = TextAlign.Center
                )
            }
        }
        
        Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                    modifier = Modifier.width(165.dp),
                    verticalArrangement = Arrangement.spacedBy(6.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
            ){
                Icon(
                        painter = painterResource(R.drawable.style3),
                        contentDescription = null,
                        tint = Color.Black,
                        modifier = Modifier.size(60.dp)
                )
                Text(
                        text = "Unique designs \n" +
                                "and high-quality materials.",
                        fontFamily = font,
                        fontSize = 13.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                )
            }
            
            Column(
                    modifier = Modifier.width(165.dp),
                    verticalArrangement = Arrangement.spacedBy(6.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
            ){
                Icon(
                        painter = painterResource(R.drawable.style4),
                        contentDescription = null,
                        tint = Color.Black,
                        modifier = Modifier.size(60.dp)
                )
                Text(
                        text = "Fast shipping. \n" +
                                "Free on orders over \$25.",
                        fontFamily = font,
                        color = Color.Black,
                        fontSize = 13.sp,
                        textAlign = TextAlign.Center
                )
            }
        }
        
    }
}