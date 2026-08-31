package com.example.project30.presentation.splashscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.project30.R
import com.example.project30.navigation.Screen
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(
        navController: NavController,
) {
    
    LaunchedEffect(Unit) {
        delay(30)
        navController.navigate(Screen.MainScree.route) {
            popUpTo(Screen.SplashScree.route) { inclusive = true }
        }
    }
    
   
    
    
    Box(
            modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(0xFF111111)),
            contentAlignment = Alignment.Center
    ) {
            Icon(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = null,
                    tint = Color(0xFF878787),
                    modifier = Modifier.size(150.dp)
            )
        Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                    painter = painterResource(R.drawable.splash),
                    contentDescription = null,
                    tint = Color(0xFF878787)
            )
            Icon(
                    painter = painterResource(R.drawable.splash),
                    contentDescription = null,
                    tint = Color(0xFF343434)
            )
            Icon(
                    painter = painterResource(R.drawable.splash),
                    contentDescription = null,
                    tint = Color(0xFF000000)
            )
        }
    }
}