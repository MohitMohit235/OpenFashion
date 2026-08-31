package com.example.project30.presentation.homecommen.justfouyoupack

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project30.R
import com.example.project30.presentation.homecommen.arricalpack.coments.Items

@Composable
fun JustBar(
        OnClickMore:()-> Unit
){
    val font = FontFamily(Font(R.font.tenorsans))
    val items = listOf(
            Items(
                    title = "21WN reversible angora cardigan",
                    image = painterResource(R.drawable.images21),
                    price = 120
            ),
            
            Items(
                    title = "Oblong bag",
                    image = painterResource(R.drawable.images14),
                    price = 120
            ),
            Items(
                    title = "21WN reversible angora cardigan",
                    image = painterResource(R.drawable.images8),
                    price = 120
            ),
            Items(
                    title = "21WN reversible angora cardigan",
                    image = painterResource(R.drawable.images16),
                    price = 120
            ),
            Items(
                    title = "Harris Tweed Three-button Jacket",
                    image = painterResource(R.drawable.image14),
                    price = 120
            ),
    )
    
    Column(
            modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 40.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
    ) {
        
        Text(
                text = "JUST FOR YOU",
                fontFamily = font,
                fontSize = 18.sp,
                letterSpacing = 2.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black
        )
        
        
        Icon(
                painter = painterResource(R.drawable._3),
                contentDescription = null,
                tint = Color.Black
        )
        
        
        LazyRow(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(items) { item ->
                
                Column(
                        modifier = Modifier.width(280.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    
                    Image(
                            painter = item.image,
                            contentDescription = item.title,
                            modifier = Modifier
                                    .fillMaxWidth()
                                    .height(380.dp),
                            contentScale = ContentScale.Crop
                    )
                    
                    Spacer(modifier = Modifier.height(14.dp))
                    
                    Text(
                            text = item.title,
                            fontFamily = font,
                            fontSize = 18.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            lineHeight = 24.sp,
                            maxLines = 2
                    )
                    
                    Spacer(modifier = Modifier.height(8.dp))
                    
                    Text(
                            text = "$${item.price}",
                            color = Color(0xFFDD8560),
                            fontFamily = font,
                            fontSize = 18.sp
                    )
                }
            }
            item {
                Button(
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                                .padding(top = 140.dp)
                                .padding(horizontal = 20.dp)
                                .border(
                                        1.5.dp,
                                        color = Color(0xFFDD8560),
                                        shape = RoundedCornerShape(8.dp)
                                ),
                        onClick = {OnClickMore()},
                        colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent
                        )
                )
                {
                    Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(5.dp)
                    ) {
                        Text(
                                text = "More",
                                color = Color(0xFFDD8560),
                                fontFamily = font,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.SemiBold
                        )
                        
                        Icon(
                                painter = painterResource(R.drawable.forwardarrow),
                                contentDescription = null,
                                tint = Color(0xFFDD8560)
                        )
                    }
                }
            }
        }
    }
}