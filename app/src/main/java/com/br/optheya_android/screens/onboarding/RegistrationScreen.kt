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
fun RegistrationScreen(navController: NavController) {
    Scaffold {
        MainRegistrationContent(navController)
    }
}

//TODO: PASSAR STRINGS PARA ARQUIVOS DE STRING

@Composable
fun MainRegistrationContent(navController: NavController) {
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
                title = "Faça parte da Optheya!",
                subtitle = "Cadastre-se para experiências incríveis!"
            )
            Column(
                modifier = Modifier
                    .padding(start = 15.dp, end = 15.dp)
            ) {
                EditText(
                    labelTitle = "Nome",
                    labelPlaceholdder = "Nome",
                    keyboardType = KeyboardType.Text
                )
                EditText(
                    labelTitle = "Email",
                    labelPlaceholdder = "Email",
                    keyboardType = KeyboardType.Email
                )
                EditText(
                    labelTitle = "Celular",
                    labelPlaceholdder = "Celular",
                    keyboardType = KeyboardType.Phone
                )
                EditText(
                    labelTitle = "Senha",
                    labelPlaceholdder = "******",
                    showEndIcon = true,
                    icon = R.drawable.ic_baseline_remove_red_eye_24, //TODO: MUDAR O ICONE E MUDAR A VISIBILIDADE DA SENHA
                    keyboardType = KeyboardType.Password
                )
                EditText(
                    labelTitle = "Confirme a senha",
                    labelPlaceholdder = "******",
                    showEndIcon = true,
                    icon = R.drawable.ic_baseline_remove_red_eye_24, //TODO: MUDAR O ICONE E MUDAR A VISIBILIDADE DA SENHA
                    keyboardType = KeyboardType.Password
                )

                PrimaryButton(label = "Fazer Cadastro", onClick = {
                    Log.d(
                        "Registration SCREEN",
                        "MainrEGISTRATIONContent: fazer login clicked"
                        )
                    }
                )
                Spacer(modifier = Modifier.height(14.dp))
//                LabelWithClick(label = "Já tem conta? ", linkLabel = "Fazer Login")
            }
        }
    }
}