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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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

fun CodePhoneLoginScreen(navController: NavController) {
    Scaffold {
//        MainInsertACodeRecoveryContent(navController)
        MainCodePhoneLoginContent(navController = navController, phone = "(11)9 9999-9999")
    }
}

//TODO: Remover string para arquivo de strings

//TODO: arrumar condicional dde mostrar emil ou sms

@Composable
fun MainCodePhoneLoginContent(navController: NavController, phone: String) {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Gray100Color
    ) {
        Column {
            TopBar(
                onClick = {
                    Log.d("TOPBAR", "MainCodePhoneLoginContent: Bck clicket")
                }
            )
            HeadersLabelToScreens(
                title = "Insira o código",
                subtitle = "O código foi enviado para ${phone}"
            )
            Column(
                modifier = Modifier
                    .padding(start = 15.dp, end = 15.dp)
            ) {


                //TODO: QUADROS CAMPO PARA DIGIATR CODIGO RECEBIDO

                //TODO: LABEL COM CONTADOR

                //TODO: ABRIR BORTAO DDE REENVIAR ASSIM QUE ACABAR O CONTADOR

                SecundaryButton(label = "Reenviar Código") {
                    Log.d("Reenviar", "MainInsertACodeRecoveryContent: REENVIAR clicket")
                }

                PrimaryButton(label = "Verificar") {
                    Log.d("VERIFICAR", "MainInsertACodeRecoveryContent: VERIFICAR clicket")
                }
            }
        }
    }
}