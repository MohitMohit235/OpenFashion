package com.example.project30.presentation.homecommen.homepack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
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
import androidx.navigation.NavController
import com.example.project30.R
import com.example.project30.navigation.Screen
import dev.chrisbanes.haze.HazeState


@Composable
fun ImageView(navController: NavController) {
    val font1 = FontFamily(Font(R.font.bodonimoda))
    // val font2 = FontFamily(Font(R.font.tenorsans))
    val hazeState = remember { HazeState() }
    
    Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
    ) {
        Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(R.drawable.mainimage),
                contentDescription = null,
                contentScale = ContentScale.Crop
        )
        
        Text(
                text = "LUXURY\n  FASHION\n&ACCESSORIES",
                fontFamily = font1,
                fontSize = 40.sp,
                lineHeight = 43.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xB5333333)
        )
        
        Box(
                modifier = Modifier
                        .padding(top = 500.dp)
        ) {
            ExploreCollectionButton(
                    text = "EXPLORE COLLECTION",
                    onClick = {
                        navController.navigate(Screen.ExploreMore.route) {
                            popUpTo(Screen.MainScree.route){inclusive=true}
                        }
                    }
            )
        }
        
    }
}