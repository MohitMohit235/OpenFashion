package com.example.project30.presentation.homecommen.arricalpack.alltablists

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project30.R
import com.example.project30.presentation.homecommen.arricalpack.coments.Card
import com.example.project30.presentation.homecommen.arricalpack.coments.Items


@Composable
fun BagCard(
        OnClickExplore:()-> Unit
){
    val font = FontFamily(Font(R.font.tenorsans))
    val items = listOf(
            Items(
                    title = "21WN reversible angora cardigan",
                    image = painterResource(R.drawable.images1),
                    price = 120
            ),
            Items(
                    title = "Oblong bag",
                    image = painterResource(R.drawable.images2),
                    price = 120
            ),
            Items(
                    title = "21WN reversible angora cardigan",
                    image = painterResource(R.drawable.images3),
                    price = 120
            ),
            Items(
                    title = "21WN reversible angora cardigan",
                    image = painterResource(R.drawable.images4),
                    price = 120
            ),
    )
    
    Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(30.dp)
    ){
        Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Card(items[0])
            Card(items[1])
        }
        
        Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
        ){
            Card(items[2])
            Card(items[3])
        }
        
        TextButton(
                onClick = {
                    OnClickExplore()}
        ) {
            Row(
                    verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                        text = "Explore More",
                        fontFamily = font,
                        fontSize = 16.sp,
                        color = Color.Black
                )
                
                Spacer(modifier = Modifier.width(15.dp))
                
                Icon(
                        painter = painterResource(R.drawable.forwardarrow),
                        contentDescription = null,
                        tint = Color.Black
                )
            }
        }
    }
    
}

