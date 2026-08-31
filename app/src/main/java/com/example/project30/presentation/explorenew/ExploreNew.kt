package com.example.project30.presentation.explorenew

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.project30.R
import com.example.project30.navigation.Screen
import com.example.project30.presentation.explorenew.explorenewcommponents.Lists
import com.example.project30.presentation.explorenew.explorenewcommponents.NewCollectionCard
import com.example.project30.presentation.homecommen.homepack.hometopbar.NewExploreTopBar

@Composable
fun ExploreNew(
        navController: NavController
) {
    
    val list = listOf(
            Lists(images = painterResource(R.drawable.images50), title = "lamerei", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images51), title = "lamerei", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images52), title = "HAE BY HAEKIM", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images53), title = "lamerei", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images1), title = "lamerei", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images2), title = "lamerei", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images54), title = "HAE BY HAEKIM", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images4), title = "lamerei", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images55), title = "HAE BY HAEKIM", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images6), title = "21WN", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images56), title = "lamerei", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images8), title = "HAE BY HAEKIM", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images9), title = "October collection", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images10), title = "lamerei", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images11), title = "HAE BY HAEKIM", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images12), title = "21WN", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images13), title = "21WN", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images14), title = "21WN", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images57), title = "21WN", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images58), title = "21WN", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images20), title = "HAE BY HAEKIM", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images54), title = "lamerei", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images5), title = "HAE BY HAEKIM", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images57), title = "21WN", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images7), title = "lamerei", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images8), title = "HAE BY HAEKIM", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images9), title = "October collection", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images10), title = "lamerei", desc = "reversible angora cardigan",price= 120),
            Lists(images = painterResource(R.drawable.images11), title = "HAE BY HAEKIM", desc = "reversible angora cardigan",price= 120),
    )
    
    Scaffold(
            topBar = {
                NewExploreTopBar(
                        onClickMenu = {
                            navController.navigate(Screen.MainScree.route)
                        },
                        navController = navController,
                        Backcolor = Color.Black,
                        Iconscolor = Color(0xFFE6E9EE)
                )
            }
    ) { paddingValues ->
        LazyVerticalGrid(
                columns = GridCells.Fixed(count = 2),
                modifier = Modifier
                        .background(color = Color.White)
                        .padding(paddingValues)
                        .fillMaxSize()
        ) {
            items(list) { item ->
                NewCollectionCard(lists = item)
            }
        }
    }
}