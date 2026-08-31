package com.example.project30.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.project30.presentation.explorecollection.ExploreMore
import com.example.project30.presentation.explorenew.ExploreNew
import com.example.project30.presentation.homecommen.homepack.hometopbar.CartScreen
import com.example.project30.presentation.homecommen.homepack.hometopbar.SearchScreen
import com.example.project30.presentation.homescreen.MainScreen
import com.example.project30.presentation.splashscreen.SplashScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    
    NavHost(
            navController = navController,
            startDestination = Screen.SplashScree.route
    ) {
        composable(
                route = Screen.SplashScree.route
        ) {
            SplashScreen(navController)
        }
        
        composable(
                route = Screen.MainScree.route
        ) {
            MainScreen(navController)
        }
        
        composable(
                route = Screen.SearchScree.route
        ) {
            SearchScreen(navController)
        }
        
        
        composable(
                route = Screen.ExploreMore.route
        ) {
            ExploreMore(navController)
        }
        
        composable(
                route = Screen.ExploreNew.route
        ) {
            ExploreNew(navController)
        }
    }
}