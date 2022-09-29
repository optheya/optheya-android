package com.br.optheya_android.screens.onboarding

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.br.optheya_android.R
import com.br.optheya_android.components.EditText
import com.br.optheya_android.components.HeadersLabelToScreens
import com.br.optheya_android.components.PrimaryButton
import com.br.optheya_android.components.TopBar
import com.br.optheya_android.ui.theme.Gray100Color

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun NewPasswordScreen(navController: NavController) {
    Scaffold {
        MainNewPasswordContent(navController)
    }
}

//TODO: Remover string para arquivo de strings

@Composable
fun MainNewPasswordContent(navController: NavController) {
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
                title = stringResource(id = R.string.redefine_pass),
                subtitle = stringResource(id = R.string.create_new_pass)
            )
            Column(
                modifier = Modifier
                    .padding(start = 15.dp, end = 15.dp)
            ) {
                EditText(
                    labelTitle =  stringResource(id = R.string.new_pass),
                    labelPlaceholdder = stringResource(id = R.string.pass_hint),
                    showEndIcon = true,
                    icon = R.drawable.ic_baseline_remove_red_eye_24, //TODO: MUDAR O ICONE E MUDAR A VISIBILIDADE DA SENHA
                    keyboardType = KeyboardType.Password
                )
                
                EditText(
                    labelTitle = stringResource(id = R.string.confirm_new_pass),
                    labelPlaceholdder =  stringResource(id = R.string.pass_hint),
                    showEndIcon = true,
                    icon = R.drawable.ic_baseline_remove_red_eye_24, //TODO: MUDAR O ICONE E MUDAR A VISIBILIDADE DA SENHA
                    keyboardType = KeyboardType.Password
                )

                PrimaryButton(label = stringResource(id = R.string.redefine_pass)) {
                    Log.d("REDEFINIR", "MainNewPasswordContent: redefinir clicket")
                }
            }
        }
    }
}