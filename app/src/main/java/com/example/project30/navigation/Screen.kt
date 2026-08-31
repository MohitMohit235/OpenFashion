package com.example.project30.navigation

sealed class Screen(val route : String){
    object SplashScree : Screen(route = "splash_screen")
    object MainScree : Screen(route = "main_screen")
    object SearchScree : Screen(route = "search_screen")
    object CartScree : Screen(route = "cart_screen")
    object ExploreMore : Screen(route = "exploremore_screen")
    
    object ExploreNew : Screen(route = "explorenew_screen")
}