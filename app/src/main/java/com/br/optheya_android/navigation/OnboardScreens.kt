package com.br.optheya_android.navigation

enum class OnboardScreens {
    SplashScreen,
    TutorialScreen,
    LoginScreen,
    HomeScreen,
    LoginEmailScreen,
    CodePhoneLoginScreen,
    EnablePermissionsScreen,
    ForgotPasswordScreen,
    InsertACodeRecoveryScreen,
    LoginPhoneScreen,
    NewPasswordScreen,
    RegistrationScreen,
    UseTermsScreen,
    PolicyPrivacityScreen,
    ARMenuScreen,
    OtherOptionsLogin,;

    companion object {
        fun fromRoute(route: String?): OnboardScreens =
            when (
                route?.substringBefore(delimiter = "/")
            ) {
                SplashScreen.name -> SplashScreen
                TutorialScreen.name -> TutorialScreen
                LoginScreen.name -> LoginScreen
                LoginEmailScreen.name -> LoginEmailScreen
                CodePhoneLoginScreen.name -> CodePhoneLoginScreen
                EnablePermissionsScreen.name -> EnablePermissionsScreen
                ForgotPasswordScreen.name -> ForgotPasswordScreen
                InsertACodeRecoveryScreen.name -> InsertACodeRecoveryScreen
                LoginPhoneScreen.name -> LoginPhoneScreen
                NewPasswordScreen.name -> NewPasswordScreen
                RegistrationScreen.name -> RegistrationScreen
                UseTermsScreen.name -> UseTermsScreen
                PolicyPrivacityScreen.name -> PolicyPrivacityScreen
                OtherOptionsLogin.name -> OtherOptionsLogin
                ARMenuScreen.name -> ARMenuScreen
                null -> SplashScreen
                else -> throw IllegalArgumentException()
            }
    }
}