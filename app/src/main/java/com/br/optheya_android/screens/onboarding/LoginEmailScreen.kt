package com.br.optheya_android.screens.onboarding

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.br.optheya_android.R
import com.br.optheya_android.components.*
import com.br.optheya_android.navigation.OnboardScreens
import com.br.optheya_android.ui.theme.Actay
import com.br.optheya_android.ui.theme.Gray100Color
import com.br.optheya_android.ui.theme.PurpleSolidColor

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LoginEmailScreen(navController: NavController) {
    Scaffold {
        MainLoginEmailContent(navController)
    }
}


@Composable
fun MainLoginEmailContent(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Gray100Color
    ) {
        Column {
            TopBar(
                onClick = {
                    navController.popBackStack()
                }
            )
            HeadersLabelToScreens(
                title = stringResource(id = R.string.welcome_back),
                subtitle = stringResource(id = R.string.make_login_xp)
            )
            Column(
                modifier = Modifier
                    .padding(start = 15.dp, end = 15.dp)
            ) {
                EditText(
                    labelTitle = stringResource(id = R.string.email_label),
                    labelPlaceholdder = stringResource(id = R.string.email_hint),
                    keyboardType = KeyboardType.Email
                )
                Spacer(modifier = Modifier.height(16.dp))
                EditText(
                    labelTitle = stringResource(id = R.string.pass_label),
                    labelPlaceholdder = stringResource(id = R.string.pass_hint),
                    showEndIcon = true,
                    icon = R.drawable.ic_baseline_remove_red_eye_24, //TODO: MUDAR O ICONE E MUDAR A VISIBILIDADE DA SENHA
                    keyboardType = KeyboardType.Password
                )
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.End,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    TextButton(onClick = {
                        navController.navigate(OnboardScreens.ForgotPasswordScreen.name)
                    }) {
                        Text(
                            text = stringResource(id = R.string.forgot),
                            color = PurpleSolidColor,
                            fontSize = 12.sp,
                            fontFamily = Actay,
                            fontWeight = FontWeight.W400
                        )
                    }
                }

                PrimaryButton(label = stringResource(id = R.string.make_login_btn), onClick = {
                        navController.navigate(OnboardScreens.HomeScreen.name) // TODO: ADD O USUARIO A ÁREA LOGADA
                    }
                )
                Spacer(modifier = Modifier.height(14.dp))
                LabelWithClick(label = stringResource(id = R.string.dont_have_acc), clicable =  stringResource(
                    id = R.string.register
                ) ) {
                    navController.navigate(OnboardScreens.RegistrationScreen.name)
                }
            }
        }
    }
}