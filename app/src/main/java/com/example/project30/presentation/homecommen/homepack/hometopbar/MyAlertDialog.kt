package com.example.project30.presentation.homecommen.homepack.hometopbar

import android.view.MenuItem
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.project30.R
import com.example.project30.presentation.homecommen.arricalpack.TabItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyAlertDialog(
        onDismissed: () -> Unit,
) {
    val items = listOf("New", "Apparel", "Bag", "Shoes", "Beauty", "Accessories")
    var selectedTab by remember { mutableStateOf("WOMAN") }
    val font = FontFamily(Font(R.font.tenorsans))
    
    
    Dialog(
            onDismissRequest = onDismissed
    ) {
        Surface(
                modifier = Modifier.fillMaxWidth(),
                color = Color(0xFFF7F7F7)
        ) {
            Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start
                ){
                    IconButton(
                            onClick = { onDismissed() }
                    ) {
                        Icon(
                                painter = painterResource(R.drawable.close),
                                contentDescription = null,
                                
                                )
                    }
                }
                
                MenuTab(
                        selected = selectedTab,
                        onSelectedTab = { selectedTab = it }
                )
                when (selectedTab) {
                    "WOMAN" -> {}
                    "MAN" -> {}
                    "KIDS" -> {}
                }
                
                items.forEach { item ->
                    ExpendBar(title = item)
                }
                
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                        modifier = Modifier.fillMaxWidth(fraction = 0.9f),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Icon(
                            painter = painterResource(R.drawable.call),
                            contentDescription = null,
                            tint = Color(0xFF555555),
                            modifier = Modifier.size(24.dp)
                    )
                    Text(
                            text = "(786) 713-8616",
                            fontSize = 22.sp,
                            fontFamily = font,
                            color = Color(0xFF555555),
                            modifier = Modifier.weight(1f)
                    )
                }
                
                Spacer(modifier = Modifier.height(20.dp))
                
                Row(
                        modifier = Modifier.fillMaxWidth(fraction = 0.9f),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Icon(
                            painter = painterResource(R.drawable.location),
                            contentDescription = null,
                            tint = Color(0xFF555555),
                            modifier = Modifier.size(24.dp)
                    )
                    Text(
                            text = "Store Locator",
                            fontSize = 22.sp,
                            fontFamily = font,
                            color = Color(0xFF555555),
                            modifier = Modifier.weight(1f)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
                Icon(
                        painter = painterResource(R.drawable._3),
                        contentDescription = null
                )
                
                Spacer(modifier = Modifier.height(50.dp))
                Row(
                        modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 100.dp, vertical = 20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    
                    Icon(
                            painter = painterResource(R.drawable.twittersolid),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp),
                            tint = Color(0xFF555555)
                    )
                    
                    Icon(
                            painter = painterResource(R.drawable.instagramsolid),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp),
                            tint = Color(0xFF555555)
                    )
                    
                    
                    Icon(
                            painter = painterResource(R.drawable.youtubesolid),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp),
                            tint = Color(0xFF555555)
                    )
                }
                
            }
        }
    }
}


@Composable
private fun MenuTab(
        text: List<String> = listOf("WOMAN", "MAN", "KIDS"),
        selected: String = text.first(),
        onSelectedTab: (String) -> Unit = {},
) {
    Row(
            modifier = Modifier
                    .wrapContentWidth()
                    .background(Color.White),
            horizontalArrangement = Arrangement.spacedBy(35.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically
    ) {
        text.forEach { item ->
            TabItem(
                    text = item,
                    isActive = item == selected,
                    onClick = { onSelectedTab(item) }
            )
        }
    }
}

@Composable
fun ExpendBar(title: String) {
    val font = FontFamily(Font(R.font.tenorsans))
    var expanded by remember { mutableStateOf(false) }
    Column {
        
        Row(
                modifier = Modifier
                        .fillMaxWidth(fraction = 0.9f)
                        .clickable { expanded = !expanded }
                        .padding(vertical = 18.dp),
                verticalAlignment = Alignment.CenterVertically
        ) {
            
            Text(
                    text = title,
                    fontSize = 22.sp,
                    fontFamily = font,
                    color = Color(0xFF2B2623),
                    modifier = Modifier.weight(1f)
            )
            
            Icon(
                    imageVector = Icons.Outlined.KeyboardArrowDown,
                    contentDescription = null,
                    tint = Color(0xFF8E837C)
            )
        }
        
        if (expanded) {
            Column(
                    modifier = Modifier
                            .padding(bottom = 12.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Text(
                        "  Dresses", color = Color.Black,
                        fontSize = 20.sp, fontFamily = font
                )
                Spacer(Modifier.height(6.dp))
                Text(
                        "  Tops", color = Color.Black,
                        fontSize = 20.sp, fontFamily = font
                )
                Spacer(Modifier.height(6.dp))
                Text(
                        "  Jackets", color = Color.Black,
                        fontSize = 20.sp, fontFamily = font
                )
            }
        }
    }
}