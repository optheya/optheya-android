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
import com.br.optheya_android.ui.theme.Actay
import com.br.optheya_android.ui.theme.PurpleSolidColor

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun NewPasswordScreen(navController: NavController) {
    Scaffold {
//        MainNewPasswordContent(navController)
        MainNewPasswordContent()
    }
}

//TODO: Remover string para arquivo de strings

@Composable
@Preview
//fun MainNewPasswordContent(navController: NavController) {
fun MainNewPasswordContent() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Gray100Color
    ) {
        Column {
            TopBar(
                onClick = {
                    Log.d("TOPBAR", "MainNewPasswordContent: Bck clicket")
                }
            )
            HeadersLabelToScreens(
                title = "Redefina sua senha",
                subtitle = "Crie uma nova senha"
            )
            Column(
                modifier = Modifier
                    .padding(start = 15.dp, end = 15.dp)
            ) {
                EditText(
                    labelTitle = "Nova senha",
                    labelPlaceholdder = "******",
                    showEndIcon = true,
                    icon = R.drawable.ic_baseline_remove_red_eye_24, //TODO: MUDAR O ICONE E MUDAR A VISIBILIDADE DA SENHA
                    keyboardType = KeyboardType.Password
                )
                
                EditText(
                    labelTitle = "Confirme a nova senha",
                    labelPlaceholdder = "******",
                    showEndIcon = true,
                    icon = R.drawable.ic_baseline_remove_red_eye_24, //TODO: MUDAR O ICONE E MUDAR A VISIBILIDADE DA SENHA
                    keyboardType = KeyboardType.Password
                )

                PrimaryButton(label = "Redefinir senha") {
                    Log.d("REDEFINIR", "MainNewPasswordContent: redefinir clicket")
                }
            }
        }
    }
}