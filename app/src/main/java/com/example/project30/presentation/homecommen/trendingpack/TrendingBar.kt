package com.example.project30.presentation.homecommen.trendingpack

import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project30.R

@Composable
fun TrendingBar(

) {
    val font = FontFamily(Font(R.font.tenorsans))
    val tags1 = listOf(
            "#2021",
            "#spring",
            "#collection",
            "#fall",
            "#dress",
            "#automcollection",
            "#openfashion"
            )
    
    
    Column(
            modifier = Modifier.fillMaxWidth().padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
                text = "@ TRENDING",
                fontFamily = font,
                fontSize = 18.sp,
                letterSpacing = 2.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black
        )
        Spacer(modifier = Modifier.height(25.dp))
        InfiniteTagSliderRtoL(tags = tags1)
        Spacer(modifier = Modifier.height(15.dp))
        InfiniteTagSliderLtoR(tags = tags1)
    }
}


@Composable
fun InfiniteTagSliderRtoL(tags: List<String>) {
    val font = FontFamily(Font(R.font.tenorsans))
    Box(modifier = Modifier.fillMaxWidth()) {
        
        Row(
                modifier = Modifier
                        .fillMaxWidth()
                        .basicMarquee(
                                iterations = Int.MAX_VALUE,
                                velocity = 40.dp
                        ),
                horizontalArrangement = Arrangement.spacedBy(40.dp)
        ) {
            repeat(20) {
                tags.forEach { logo ->
                    Text(
                            text = "${logo}",
                            fontFamily = font,
                            fontSize = 16.sp,
                            color = Color.Black
                    )
                }
            }
        }
    }
}



@Composable
fun InfiniteTagSliderLtoR(tags: List<String>) {
    val font = FontFamily(Font(R.font.tenorsans))
    Box(modifier = Modifier.fillMaxWidth()) {
        
        Row(
                modifier = Modifier
                        .fillMaxWidth()
                        .basicMarquee(
                                iterations = Int.MAX_VALUE,
                                velocity = -40.dp
                        ),
                horizontalArrangement = Arrangement.spacedBy(40.dp)
        ) {
            repeat(20) {
                tags.forEach { logo ->
                    Text(
                            text = "${logo}",
                            fontFamily = font,
                            fontSize = 16.sp,
                            color = Color.Black
                    )
                }
            }
        }
    }
}
