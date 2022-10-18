package com.br.optheya_android.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.br.optheya_android.screens.onboarding.HomeScreen
import com.br.optheya_android.screens.search.SearchHomeScreen

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ){
        composable(route = BottomBarScreen.Home.route){
            HomeScreen(navController)
        }

        composable(route = BottomBarScreen.Search.route){
            SearchHomeScreen(navController)
        }
    }
}