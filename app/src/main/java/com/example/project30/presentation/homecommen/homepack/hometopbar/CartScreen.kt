package com.example.project30.presentation.homecommen.homepack.hometopbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.project30.R
import com.example.project30.navigation.Screen

@Composable
fun CartScreen(
        navController: NavController
){
    val font = FontFamily(Font(R.font.tenorsans))
    Box(
            modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.White),
    ) {
        Column(
                modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 50.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                        text = "Cart",
                        fontFamily = font,
                        fontSize = 22.sp
                )
                IconButton(
                        onClick = {
                            navController.navigate(Screen.MainScree.route){
                                popUpTo(Screen.CartScree.route){inclusive=true}
                            }
                        }
                ) {
                    Icon(
                            painter = painterResource(R.drawable.close),
                            contentDescription = null,
                            modifier = Modifier.size(35.dp)
                    )
                }
            }
            Button(
                     modifier = Modifier.padding(bottom = 40.dp),
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                    onClick = {}
            ){
                Row(
                        modifier = Modifier.fillMaxWidth().height(40.dp).padding(horizontal = 60.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                ){
                    
                    Icon(
                            painter = painterResource(R.drawable.shoppingbag),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                    )
                    
                    Text(
                            text = "Continue shopping".uppercase(),
                            fontFamily = font,
                            fontSize = 18.sp
                    )
                }
            }
        }
    }
}