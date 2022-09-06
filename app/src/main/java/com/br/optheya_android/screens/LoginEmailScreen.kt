package com.br.optheya_android.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.br.optheya_android.components.EditText
import com.br.optheya_android.components.HeadersLabelToScreens
import com.br.optheya_android.components.TopBar
import com.br.optheya_android.ui.theme.Gray100Color
import com.br.optheya_android.R

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LoginEmailScreen(navController: NavController) {
//fun LoginEmailScreen() {
    Scaffold {
        MainLoginEmailContent(navController)
//        MainLoginEmailContent()
    }
}

@Composable
//@Preview
fun MainLoginEmailContent(navController: NavController) {
//fun MainLoginEmailContent() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Gray100Color
    ) {
        Column {
            TopBar()
            HeadersLabelToScreens(
                title = "Bem-vindo de volta! \uD83D\uDC4B",
                subtitle = "Faça login para experiências incríveis!"
            )
            Column(
                modifier = Modifier
                    .padding(start = 15.dp, end = 15.dp)
            ) {
                EditText(
                    labelTitle = "Email",
                    labelPlaceholdder = "Seu email cadastrado",
                    keyboardType = KeyboardType.Email
                )
                Spacer(modifier = Modifier.height(16.dp))
                EditText(
                    labelTitle = "Senha",
                    labelPlaceholdder = "******",
                    showEndIcon = true,
                    icon = R.drawable.ic_baseline_remove_red_eye_24,
                    keyboardType = KeyboardType.Password
                )
            }
        }
    }
}