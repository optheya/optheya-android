package com.br.optheya_android.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.br.optheya_android.components.BackgroundOnboarding
import com.br.optheya_android.components.SecundaryButton
import com.br.optheya_android.navigation.OnboardScreens
import com.br.optheya_android.ui.theme.Actay
import com.br.optheya_android.ui.theme.Gray900Color
import com.br.optheya_android.ui.theme.WhiteColor

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun OtherOptionsLoginScreen(navController: NavController) {
    Scaffold(

    ) {
        MainOtherOptionsLoginContent(navController = navController)
    }
}

@Composable
fun MainOtherOptionsLoginContent(navController: NavController) {



    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        BackgroundOnboarding(label = "Falta pouco pra você ter os melhores pratos na palma da mão!")
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ChoiceOptions(navController = navController)
        }
    }
}

@Composable
fun ChoiceOptions(navController: NavController){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.45f),
        color = WhiteColor,
        shape = RoundedCornerShape(topStart = 14.dp, topEnd = 14.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        ) {
            Spacer(modifier = Modifier.height(57.dp))
            Text(
                    text = "Como deseja continuar?",
                    color = Gray900Color,
                    fontWeight = FontWeight.W400,
                    fontSize = 14.sp,
                    fontFamily = Actay
                )
                Spacer(modifier = Modifier.height(24.dp))

                SecundaryButton(label = "Conectar com e-mail") {
                       navController.navigate(OnboardScreens.LoginEmailScreen.name)
                }

                Spacer(modifier = Modifier.height(16.dp))

                SecundaryButton(label = "Conectar com celular") {
                    navController.navigate(OnboardScreens.LoginPhoneScreen.name)
                }
        }
    }
}
