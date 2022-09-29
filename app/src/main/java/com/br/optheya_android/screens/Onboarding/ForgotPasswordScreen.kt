package com.br.optheya_android.screens

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.br.optheya_android.R
import com.br.optheya_android.components.*
import com.br.optheya_android.navigation.OnboardScreens
import com.br.optheya_android.ui.theme.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ForgotPasswordScreen(navController: NavController) {
    Scaffold {
        MainForgotPasswordContent(navController)
    }
}

//TODO: Remover string para arquivo de strings

@Composable
fun MainForgotPasswordContent(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Gray100Color
    ) {
        Column {
            TopBar(
                onClick = {
                    Log.d("OnClick", "MainForgotPasswordContent: Bck clicket")
                }
            )
            Spacer(modifier = Modifier.height(24.dp))
            HeadersLabelToScreens(
                title = "Esqueceu sua senha?",
                subtitle = "Selecione a forma de reuperação"
            )
            LargeButtonWithIcon(label = "Via SMS", icon = R.drawable.ic_icon_rec_sms) {
                navController.navigate(OnboardScreens.InsertACodeRecoveryScreen.name)
            }

            LargeButtonWithIcon(label = "Via E-mail", icon = R.drawable.ic_icon_rec_email) {
                navController.navigate(OnboardScreens.InsertACodeRecoveryScreen.name)
            }
        }
    }
}