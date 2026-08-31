package com.example.project30.presentation.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.project30.navigation.Screen
import com.example.project30.presentation.homecommen.arricalpack.alltablists.AllItemCard
import com.example.project30.presentation.homecommen.arricalpack.ArrivalView
import com.example.project30.presentation.homecommen.collectinpack.CollectionBar
import com.example.project30.presentation.homecommen.followpack.FollowBar
import com.example.project30.presentation.homecommen.homepack.hometopbar.HomeTopBar
import com.example.project30.presentation.homecommen.homepack.ImageView
import com.example.project30.presentation.homecommen.homepack.LogoAnimation
import com.example.project30.presentation.homecommen.homepack.hometopbar.MyAlertDialog
import com.example.project30.presentation.homecommen.justfouyoupack.JustBar
import com.example.project30.presentation.homecommen.stylepack.StyleBar
import com.example.project30.presentation.homecommen.trendingpack.TrendingBar

@Composable
fun MainScreen(
        navController: NavController,
) {
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
                HomeTopBar(
                        onClickMenu = {
                            showMenu = true
                        },
                        navController = navController,
                        Backcolor = Color(0xFFE6E9EE),
                        Iconscolor = Color.Black
                )
            }
    ) { paddingValues ->
        LazyColumn(
                modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.White)
                        .padding(paddingValues),
                horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                
                // Main Image
                ImageView(navController)
                
                
                // Category
                ArrivalView(OnClickExplore = {
                    navController.navigate(Screen.ExploreNew.route){
                        popUpTo(Screen.MainScree.route){inclusive = true}
                    }
                })
                
                
                // All Brands Animation
                LogoAnimation()
                
                // Collections
                CollectionBar()
                
                //
                JustBar(
                        OnClickMore = {
                            navController.navigate(Screen.ExploreNew.route){
                                popUpTo(Screen.MainScree.route){inclusive = true}
                            }
                        }
                )
                
                // TrendingBar
                TrendingBar()
                
                // StyleBar
                StyleBar()
                
                // Follow
                FollowBar()
            }
        }
    }
}