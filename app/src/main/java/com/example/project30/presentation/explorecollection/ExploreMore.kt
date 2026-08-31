package com.example.project30.presentation.explorecollection

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.project30.R
import com.example.project30.navigation.Screen
import com.example.project30.presentation.explorecollection.explorecommponents.CollectionCard
import com.example.project30.presentation.explorecollection.explorecommponents.Lists
import com.example.project30.presentation.homecommen.homepack.hometopbar.ExploreTopBar
import com.example.project30.presentation.homecommen.homepack.hometopbar.HomeTopBar
import com.example.project30.presentation.homecommen.homepack.hometopbar.MyAlertDialog

@Composable
fun ExploreMore(
        navController: NavController,
) {
    val list = listOf(
            Lists(images = painterResource(R.drawable.images1), name = "October collection"),
            Lists(images = painterResource(R.drawable.images2), name = "Black collection"),
            Lists(images = painterResource(R.drawable.images3), name = "HAE BY HAEKIM"),
            Lists(images = painterResource(R.drawable.images4), name = "Black collection"),
            Lists(images = painterResource(R.drawable.images5), name = "HAE BY HAEKIM"),
            Lists(images = painterResource(R.drawable.images6), name = "October collection"),
            Lists(images = painterResource(R.drawable.images7), name = "Black collection"),
            Lists(images = painterResource(R.drawable.images8), name = "HAE BY HAEKIM"),
            Lists(images = painterResource(R.drawable.images9), name = "October collection"),
            Lists(images = painterResource(R.drawable.images10), name = "Black collection"),
            Lists(images = painterResource(R.drawable.images11), name = "HAE BY HAEKIM"),
            Lists(images = painterResource(R.drawable.images12), name = "October collection"),
            Lists(images = painterResource(R.drawable.images13), name = "October collection"),
            Lists(images = painterResource(R.drawable.images14), name = "October collection"),
            Lists(images = painterResource(R.drawable.images16), name = "October collection"),
            Lists(images = painterResource(R.drawable.images17), name = "October collection"),
    )
    var showMenu by remember { mutableStateOf(false) }
    
    if (showMenu) {
        MyAlertDialog(
                onDismissed = {
                    showMenu = false
                }
        )
    }
    
    Scaffold(
            topBar = {
                ExploreTopBar(
                        onClickMenu = {
                            navController.navigate(Screen.MainScree.route)
                        },
                        navController = navController,
                        Backcolor = Color.Black,
                        Iconscolor = Color(0xFFE6E9EE)
                )
            }
    ) { paddingValues ->
        LazyColumn(
                modifier = Modifier
                        .background(color = Color.Black)
                        .padding(paddingValues)
                        .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(40.dp)
        ) {
            item {
                Icon(
                        painter = painterResource(R.drawable.collection),
                        contentDescription = null,
                        modifier = Modifier.size(200.dp),
                        tint = Color.White
                )
            }
            items(list) { item ->
                CollectionCard(item)
            }
        }
    }
}