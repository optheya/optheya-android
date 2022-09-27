package com.br.optheya_android.screens

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.br.optheya_android.ui.theme.Gray100Color
import com.br.optheya_android.R
import com.br.optheya_android.components.*
import com.br.optheya_android.navigation.OnboardScreens
import com.br.optheya_android.ui.theme.Actay
import com.br.optheya_android.ui.theme.PurpleSolidColor

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LoginPhoneScreen(navController: NavController) {
    Scaffold {
        MainLoginPhoneContent(navController)
    }
}

//TODO: Remover string para arquivo de strings

@Composable
fun MainLoginPhoneContent(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Gray100Color
    ) {
        Column {
            TopBar(
                onClick = {
                    Log.d("TOPBAR", "MainLoginEmailContent: Bck clicket")
                }
            )
            HeadersLabelToScreens(
                title = "Bem-vindo de volta! \uD83D\uDC4B",
                subtitle = "Faça login com seu número de celular"
            )
            Column(
                modifier = Modifier
                    .padding(start = 15.dp, end = 15.dp)
            ) {
                EditText(
                    labelTitle = "Celular",
                    labelPlaceholdder = "Insira seu número de celular",
                    keyboardType = KeyboardType.Phone
                )

                PrimaryButton(label = "Enviar código", onClick = {
                    navController.navigate(OnboardScreens.CodePhoneLoginScreen.name)
                }
                )
                Spacer(modifier = Modifier.height(14.dp))
                LabelWithClick(label = "Ainda não tem uma conta? ", linkLabel = "Cadastrar")
            }
        }
    }
}