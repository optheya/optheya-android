package com.br.optheya_android.navigation

enum class OnboardScreens {
    SplashScreen,
    TutorialScreen,
    LoginScreen,
    HomeScreen;

    companion object {
        fun fromRoute(route: String?): OnboardScreens =
            when (
                route?.substringBefore(delimiter = "/")
            ) {
                SplashScreen.name -> SplashScreen
                TutorialScreen.name -> TutorialScreen
                LoginScreen.name -> LoginScreen
                HomeScreen.name -> HomeScreen
                null -> SplashScreen
                else -> throw IllegalArgumentException()
            }
    }
}