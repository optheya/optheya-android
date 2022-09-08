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

@OptIn(ExperimentalMaterialApi::class)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LoginScreen(navController: NavController) {

    val bottomSheetScaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = BottomSheetState(BottomSheetValue.Collapsed)
    )
    val coroutineScope = rememberCoroutineScope()

    Scaffold(

    ) {
        MainLoginContent(navController = navController, coroutineScope = coroutineScope, bottomSheetScaffoldState = bottomSheetScaffoldState)
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MainLoginContent(navController: NavController, coroutineScope: CoroutineScope, bottomSheetScaffoldState: BottomSheetScaffoldState) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        BackgroundOnboarding(label = "Falta pouco pra você ter os melhores pratos na palma da mão!")
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LoginOptions(navController = navController, coroutineScope = coroutineScope, bottomSheetScaffoldState = bottomSheetScaffoldState)
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun LoginOptions(navController: NavController, coroutineScope: CoroutineScope, bottomSheetScaffoldState: BottomSheetScaffoldState){

    var stateModal by remember {
        mutableStateOf(false)
    }

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.45f),
        color = WhiteColor
    ) {
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        ) {
            PrimaryButton(label = "Continuar com o Google", hasIcon = true, iconDraw = R.drawable.google_badge) {
                Log.d("LOGIN GOOGLE", "LoginOptions: Login google clicket")
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                SecundaryButton(label = "Logar depois", modifier = Modifier.fillMaxWidth(0.5f)) {
                   navController.navigate(OnboardScreens.HomeScreen.name)
                }

                Spacer(modifier = Modifier.width(9.dp))

                SecundaryButton(label = "Outras opções") {
                    Log.d("OUTRAS OPÇÕES", "LoginOptions: OUTRAS OPÇOES CLICKET")
                }
            }
            Text(
                modifier = Modifier
                    .padding(end = 39.dp, start = 39.dp, bottom = 20.dp, top = 24.dp)
                    .width(242.dp),
                text = buildAnnotatedString {
                    append(stringResource(id = R.string.warnign_creating_account) + " ")
                    withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)) {
                        append(stringResource(id = R.string.warnign_use_term))
                    }
                    append(" " +  stringResource(id = R.string.and) + " ")
                    withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)) {
                        append(stringResource(id = R.string.warnign_privacity_policy))
                    }
                },
                fontFamily = Actay,
                fontWeight = FontWeight.W400,
                fontSize = 12.sp,
                color = Gray900Color,
                textAlign = TextAlign.Center
            )
        }
    }
}
