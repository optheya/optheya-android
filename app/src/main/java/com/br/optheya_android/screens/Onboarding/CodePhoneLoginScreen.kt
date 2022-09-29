package com.br.optheya_android.screens

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.br.optheya_android.R
import com.br.optheya_android.components.*
import com.br.optheya_android.ui.theme.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable

fun CodePhoneLoginScreen(navController: NavController) {
    Scaffold {
//        MainInsertACodeRecoveryContent(navController)
        MainCodePhoneLoginContent(navController = navController, phone = "(11)9 9999-9999")
    }
}

//TODO: Remover string para arquivo de strings

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


                Column(
                    modifier = Modifier
                        .padding(start = 43.dp, end = 43.dp, top = 11.dp)
                ) {
                    CodeVerifierField()
                }

                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 33.dp, bottom = 44.dp)
                ) {
                    Text(
                        text = "Reenviar código em",
                        fontFamily = Actay,
                        fontWeight = FontWeight.W400,
                        fontSize = 14.sp,
                        color = Gray600Color
                    )

                    //TODO: CODAR A RODAGEM DO CONTADOR
                    Text(
                        text = " 0s",
                        fontFamily = Actay,
                        fontWeight = FontWeight.W400,
                        fontSize = 14.sp,
                        color = SecundaryPrincipalColor
                    )
                }


                //TODO: ABRIR BORTAO DDE REENVIAR ASSIM QUE ACABAR O CONTADOR

                SecundaryButton(label = "Reenviar Código", Modifier.fillMaxWidth()) {
                    Log.d("Reenviar", "MainInsertACodeRecoveryContent: REENVIAR clicket")
                }

                PrimaryButton(label = "Verificar") {
                    Log.d("VERIFICAR", "MainInsertACodeRecoveryContent: VERIFICAR clicket")
                }
            }
        }
    }
}