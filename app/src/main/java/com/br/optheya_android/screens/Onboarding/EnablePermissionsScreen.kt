package com.br.optheya_android.screens

import android.annotation.SuppressLint
import android.util.Log
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.br.optheya_android.R
import com.br.optheya_android.components.BackgroundOnboarding
import com.br.optheya_android.components.PrimaryButton
import com.br.optheya_android.components.SecundaryButton
import com.br.optheya_android.navigation.OnboardScreens
import com.br.optheya_android.ui.theme.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun EnablePermissions(navController: NavController) {
    Scaffold() {
        MainEnablePermissionContent(navController)
    }
}

@Composable
fun MainEnablePermissionContent(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        BackgroundOnboarding(
            label = "Estamos quase lá! Agora você só precisa habilitar algumas permissões para ter" +
                    " acesso a todas as funcionalidades!"
        )
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            EnableOptions(navController = navController)
        }
    }
}

@Composable
fun EnableOptions(navController: NavController){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.45f),
        color = WhiteColor
    ) {
        Column(
            modifier = Modifier
                .padding(start = 15.dp, end = 15.dp, bottom = 62.dp, ),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            PrimaryButton(label = "Habilitar permissões") {
                Log.d("Habilita permissao", "EnableOptions: Habilita permisoes clicket ")
            }

            SecundaryButton(label = "Pular") {
                Log.d("Pular habuilitar", "EnableOptions: Pular habilitar")
            }
        }
    }
}