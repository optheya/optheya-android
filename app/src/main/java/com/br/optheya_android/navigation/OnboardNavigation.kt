package com.br.optheya_android.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.br.optheya_android.screens.*
import kotlinx.coroutines.delay

@Composable
fun OnboardNavigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = OnboardScreens.SplashScreen.name
    ) {
        composable(
            route = OnboardScreens.SplashScreen.name
        ){
            LaunchedEffect(Unit) {
                delay(2000L)
                navController.navigate(OnboardScreens.TutorialScreen.name)
            }
            SplashScreen(navController = navController)
        }

        composable(
            route = OnboardScreens.TutorialScreen.name
        ){ backStackEntry ->
            TutorialScreen(
                navController = navController,
                skipTutorial = OnboardScreens.LoginScreen.name
            )
        }

        composable(
            route = OnboardScreens.LoginScreen.name
        ){ backStackEntry ->
            LoginScreen(
                navController = navController,
            )
        }

        composable(route = OnboardScreens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }

        composable(route = OnboardScreens.LoginEmailScreen.name) {
            LoginEmailScreen(navController = navController)
        }
    }
}