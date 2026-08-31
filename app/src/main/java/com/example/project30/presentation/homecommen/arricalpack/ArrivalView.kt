package com.example.project30.presentation.homecommen.arricalpack

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
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
import com.example.project30.R
import com.example.project30.presentation.homecommen.arricalpack.alltablists.AllItemCard
import com.example.project30.presentation.homecommen.arricalpack.alltablists.ApparelCard
import com.example.project30.presentation.homecommen.arricalpack.alltablists.BagCard
import com.example.project30.presentation.homecommen.arricalpack.alltablists.DressCard
import com.example.project30.presentation.homecommen.arricalpack.alltablists.TshirtCard

@Composable
fun ArrivalView(
        OnClickExplore: () -> Unit,
) {
    val font2 = FontFamily(Font(R.font.tenorsans))
    var selectedTab by remember { mutableStateOf("All") }
    
    Box(
            modifier = Modifier
                    .fillMaxSize()
    ) {
        Column(
                modifier = Modifier
                        .padding(top = 30.dp)
                        .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                    text = "NEW ARRIVAL",
                    fontFamily = font2,
                    fontSize = 18.sp,
                    letterSpacing = 2.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black
            )
            
            Spacer(modifier = Modifier.height(10.dp))
            
            Icon(
                    painter = painterResource(R.drawable._3),
                    contentDescription = null,
                    tint = Color.Black
            )
            
            
            TabIndicatorRow(
                    selected = selectedTab,
                    onTabSelected = { selectedTab = it }
            )
            
            when (selectedTab) {
                "All" -> AllItemCard(OnClickExplore = {OnClickExplore()})
                "Apparel" -> ApparelCard(OnClickExplore = {OnClickExplore()})
                "Dress" -> DressCard(OnClickExplore = {OnClickExplore()})
                "Tshirt" -> TshirtCard(OnClickExplore = {OnClickExplore()})
                "Bag" -> BagCard(OnClickExplore = {OnClickExplore()})
            }
            
        }
    }
}