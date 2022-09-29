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
import androidx.compose.ui.res.stringResource
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
fun InsertACodeRecoveryScreen(navController: NavController, isSMS: Boolean, isEmail: Boolean) {
    Scaffold {
        MainInsertACodeRecoveryContent(navController, isSMS, isEmail)  //TODO: RECCEBER O QUE É POR PARAMETRO NO NAVIGATION
    }
}


//TODO: arrumar condicional dde mostrar emil ou sms

@Composable
fun MainInsertACodeRecoveryContent(navController: NavController, isEmail: Boolean, isSMS: Boolean) {
    var subtitleCompl  = remember {
        mutableStateOf("")
    }
    if (isEmail) {
        subtitleCompl = remember {
            mutableStateOf("exemple@example.com")
        }
    }  else if(isSMS){
        subtitleCompl = remember {
            mutableStateOf("(11)99999-9999")
        }
    }

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
                title = stringResource(id = R.string.inside_code),
                subtitle = "O código foi enviado para ${subtitleCompl.value}" //TODO: FAZER STRING COM INTERPOLAÇÃO
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
                        text = stringResource(id = R.string.resend_code_time),
                        fontFamily = Actay,
                        fontWeight = FontWeight.W400,
                        fontSize = 14.sp,
                        color = Gray600Color
                    )

                    Text( //TODO: CODAR A RODAGEM DO CONTADOR
                        text = " 0s",
                        fontFamily = Actay,
                        fontWeight = FontWeight.W400,
                        fontSize = 14.sp,
                        color = SecundaryPrincipalColor
                    )
                }



                SecundaryButton(label = stringResource(id = R.string.resend_code_btn), modifier = Modifier.fillMaxWidth()) {
                    Log.d("Reenviar", "MainInsertACodeRecoveryContent: REENVIAR clicket")
                }

                PrimaryButton(label = stringResource(id = R.string.verify)) {
                    //TODO: Deve haver a verificação do codigo digitado e com isso, se tiver ok mandar para apágina d new ppass
                    navController.navigate(OnboardScreens.NewPasswordScreen.name)
                }
            }
        }
    }
}