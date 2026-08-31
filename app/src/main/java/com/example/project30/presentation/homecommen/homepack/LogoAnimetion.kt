package com.example.project30.presentation.homecommen.homepack

import androidx.compose.foundation.Image
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.project30.R

@Composable
fun InfiniteBrandSlider(brandLogos: List<Int>) {
    
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
                brandLogos.forEach { logo ->
                    Image(
                            painter = painterResource(logo),
                            contentDescription = null,
                            modifier = Modifier.size(120.dp, 60.dp)
                    )
                }
            }
        }
    }
}


@Composable
fun LogoAnimation() {
    val brandLogos = listOf(
            R.drawable.prada,
            R.drawable.burberry,
            R.drawable.boss,
            R.drawable.catier,
            R.drawable.gucci,
            R.drawable.tiffany_co
    )
    
    Column(
            verticalArrangement = Arrangement.spacedBy(25.dp),
            horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
                painter = painterResource(R.drawable._3),
                contentDescription = null,
                tint = Color.Black
        )
        
        InfiniteBrandSlider(brandLogos = brandLogos)
        
        Icon(
                painter = painterResource(R.drawable._3),
                contentDescription = null,
                tint = Color.Black
        )
    }
}