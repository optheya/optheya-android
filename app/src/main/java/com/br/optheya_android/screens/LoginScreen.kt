package com.br.optheya_android.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.br.optheya_android.R
import com.br.optheya_android.navigation.OnboardScreens
import com.br.optheya_android.ui.theme.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LoginScreen(navController: NavController) {
    Scaffold(

    ) {
        MainLoginContent(navController = navController)
    }
}

@Composable
fun MainLoginContent(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        BackgroundScreenBox()
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LoginOptions(navController = navController)
        }
    }
}

@Composable
fun LoginOptions(navController: NavController){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.45f),
        color = WhiteColor
    ) {
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp, start = 16.dp),
                onClick = {
                    navController.navigate(OnboardScreens.TutorialScreen.name)//MUDAR QUANDO CRIAR A TELA DELE
                },
                colors = ButtonDefaults.buttonColors(PrimaryPrincipalColor),
                shape = RoundedCornerShape(
                    corner = CornerSize(
                        size = 8.dp
                    )
                )
            ) {
                Text(
                    text = stringResource(id = R.string.continue_with_google),
                    fontFamily = Actay,
                    fontWeight = FontWeight.W400,
                    fontSize = 16.sp,
                    color = WhiteColor
                )
                Image(
                    modifier = Modifier
                        .padding(start = 8.dp),
                    painter = painterResource(id = R.drawable.google_badge),
                    contentDescription = stringResource(id = R.string.continue_with_google)
                )
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Button(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(start = 16.dp),
                    onClick = {
                        navController.navigate(OnboardScreens.HomeScreen.name)
                    },
                    colors = ButtonDefaults.buttonColors(Gray100Color),
                    border = BorderStroke(width = 1.dp, color = PrimaryPrincipalColor),
                    shape = RoundedCornerShape(
                        corner = CornerSize(
                            size = 8.dp
                        )
                    )
                ) {
                    Text(
                        text = stringResource(id = R.string.login_latter),
                        fontFamily = Actay,
                        fontWeight = FontWeight.W400,
                        fontSize = 16.sp,
                        color = PrimaryPrincipalColor
                    )
                }

                Spacer(modifier = Modifier.width(9.dp))
                
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 16.dp),
                    onClick = {
                        navController.navigate(OnboardScreens.SplashScreen.name) //MUDAR QUANDO CRIAR A TELA DELE
                    },
                    colors = ButtonDefaults.buttonColors(Gray100Color),
                    border = BorderStroke(width = 1.dp, color = PrimaryPrincipalColor),
                    shape = RoundedCornerShape(
                        corner = CornerSize(
                            size = 8.dp
                        )
                    )
                ) {
                    Text(
                        text = stringResource(id = R.string.another_options),
                        fontFamily = Actay,
                        fontWeight = FontWeight.W400,
                        fontSize = 16.sp,
                        color = PrimaryPrincipalColor
                    )
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

@Composable
fun BackgroundScreenBox(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        PrimaryPrincipalColor,
                        PrimaryPrincipalColor,
                        PrimaryCrystalClearColor
                    ),
                )
            )
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .padding(start = 130.dp, end = 130.dp, top = 49.1f.dp)
                    .height(44.dp)
                    .width(60.dp),
                painter = painterResource(id = R.drawable.logowithe),
                contentDescription = stringResource(id = R.string.contentDescLogo)
            )
            Text(
                modifier = Modifier
                    .padding(top = 14.dp),
                text = stringResource(id = R.string.app_name),
                fontFamily = Actay,
                fontWeight = FontWeight.W700,
                fontSize = 24.sp,
                color = WhiteColor
            )
            Text(
                modifier = Modifier
                    .padding(start = 43.dp, end = 43.dp, top = 38.dp)
                    .width(234.dp),
                text = stringResource(id = R.string.subtitle_login_screen),
                fontFamily = Actay,
                fontWeight = FontWeight.W400,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                color = Gray300Color
            )
        }
    }
}
