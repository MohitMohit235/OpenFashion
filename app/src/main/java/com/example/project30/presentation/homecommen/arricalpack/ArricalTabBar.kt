package com.example.project30.presentation.homecommen.arricalpack

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project30.R

private val ActiveColor = Color(0xFF171717)
private val InactiveColor = Color(0xFFB5B0AA)
private val DotColor = Color(0xFFE08654)

@Composable
fun TabIndicatorRow(
        tabs: List<String> = listOf("All", "Apparel", "Dress", "Tshirt", "Bag"),
        selected: String = tabs.first(),
        onTabSelected:  (String) -> Unit = {}
) {
    Row(
            modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(vertical = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(28.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically
    ) {
        tabs.forEach { tab ->
            TabItem(
                    text = tab,
                    isActive = tab == selected,
                    onClick = { onTabSelected(tab) }
            )
        }
    }
}

@Composable
 fun TabItem(
        text: String,
        isActive: Boolean,
        onClick: () -> Unit
) {
    
    val font = FontFamily(Font(R.font.tenorsans))
    
    Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                    .clickable(
                            indication = null,
                            interactionSource = remember { MutableInteractionSource() }
                    ) { onClick() }
                    .padding(horizontal = 4.dp, vertical = 4.dp)
    ) {
        Text(
                text = text,
                fontFamily = font,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                color = if (isActive) ActiveColor else InactiveColor
        )
        
        Spacer(modifier = Modifier.height(6.dp))
        
        
        Box(
                modifier = Modifier
                        .size(if (isActive) 6.dp else 0.dp)
                        .clip(RectangleShape)
                        .background(if (isActive) DotColor else Color.Transparent, CircleShape)
        )
    }
}