package com.br.optheya_android.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.br.optheya_android.screens.*
import com.br.optheya_android.screens.onboarding.*
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

        composable(
            route = OnboardScreens.OtherOptionsLogin.name
        ){ backStackEntry ->
            OtherOptionsLoginScreen(
                navController = navController,
            )
        }

        composable(route = OnboardScreens.HomeScreen.name) {
            MainScreen()
        }

        composable(route = OnboardScreens.LoginEmailScreen.name) {
            LoginEmailScreen(navController = navController)
        }

        composable(route = OnboardScreens.CodePhoneLoginScreen.name) {
            CodePhoneLoginScreen(navController = navController )
        }

        composable(route = OnboardScreens.LoginPhoneScreen.name) {
            LoginPhoneScreen(navController = navController)
        }

        composable(route = OnboardScreens.ForgotPasswordScreen.name) {
            ForgotPasswordScreen(navController = navController)
        }

        composable(
            route = OnboardScreens.InsertACodeRecoveryScreen.name
        ){ backStackEntry ->
            InsertACodeRecoveryScreen(
                navController = navController,
                isSMS = true,
                isEmail = false
            )
        }

        composable(route = OnboardScreens.NewPasswordScreen.name) {
            NewPasswordScreen(navController = navController)
        }

        composable(route = OnboardScreens.RegistrationScreen.name) {
            RegistrationScreen(navController = navController)
        }

        composable(route = OnboardScreens.EnablePermissionsScreen.name) {
            EnablePermissionsScreen(navController = navController)
        }
    }
}