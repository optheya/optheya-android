package com.br.optheya_android.screens

import android.annotation.SuppressLint
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.br.optheya_android.R
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
        BackgroundScreenBox()
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

    if (stateModal){
        BottomSheet(bottomSheetScaffoldState = bottomSheetScaffoldState, coroutineScope = coroutineScope)
    }

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
                        stateModal = false //mudar aqui para abbrir o modal
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

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomSheet(bottomSheetScaffoldState: BottomSheetScaffoldState, coroutineScope: CoroutineScope){
    BottomSheetScaffold(
        scaffoldState = bottomSheetScaffoldState,
        backgroundColor = Color.Transparent,
        sheetContent = {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ) {
                Text(text = "Hello from sheet")
            }
        }, sheetPeekHeight = 0.dp
    ) {
        Button(onClick = {
            coroutineScope.launch {

                if (bottomSheetScaffoldState.bottomSheetState.isCollapsed) {
                    bottomSheetScaffoldState.bottomSheetState.expand()
                } else {
                    bottomSheetScaffoldState.bottomSheetState.collapse()
                }
            }
        }) {
            Text(text = "Expand/Collapse Bottom Sheet")
        }
    }
}