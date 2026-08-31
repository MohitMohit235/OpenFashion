package com.example.project30.presentation.homecommen.homepack.hometopbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.project30.R
import com.example.project30.navigation.Screen

@Composable
fun SearchScreen(
        navController: NavController,
) {
    var text by remember { mutableStateOf("") }
    val font = FontFamily(Font(R.font.tenorsans))
    val searchTrends = listOf("Trend", "Dress", "Bag", "Tshirt", "Beauty", "Accessories")
    
    Box(
            modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.White),
    ) {
        Column(
                modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 20.dp)
                        .padding(top = 70.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Top
        ) {
            TextField(
                    value = text,
                    onValueChange = { text = it },
                    textStyle = TextStyle(fontFamily = font),
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent,
                            focusedIndicatorColor = Color.Black,
                            unfocusedIndicatorColor = Color.Black
                    ),
                    leadingIcon = {
                        Icon(
                                painter = painterResource(R.drawable.search),
                                contentDescription = null,
                                modifier = Modifier.size(35.dp)
                        )
                    },
                    placeholder = {
                        Text(
                                text = "Search items",
                                fontFamily = font,
                                fontSize = 18.sp
                        )
                    },
                    trailingIcon = {
                        IconButton(
                                onClick = {
                                    navController.navigate(Screen.MainScree.route)
                                }
                        ) {
                            Icon(
                                    painter = painterResource(R.drawable.close),
                                    contentDescription = null,
                                    modifier = Modifier.size(35.dp)
                            )
                        }
                    }
            )
            
            Spacer(modifier = Modifier.height(15.dp))
            
            Text(
                    text = "Popular search items",
                    fontFamily = font,
                    fontSize = 14.sp,
                    color = Color(0xFF888888)
            )
            
            Spacer(modifier = Modifier.height(15.dp))
            
          Column(
            verticalArrangement = Arrangement.spacedBy(20.dp)
          ) {
            searchTrends.forEach { text->
                Text(
                        text = text,
                        fontFamily = font,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF121212)
                )
            }
          }
        }
    }
}