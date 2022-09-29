package com.br.optheya_android.screens.onboarding

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.br.optheya_android.R
import com.br.optheya_android.components.*
import com.br.optheya_android.navigation.OnboardScreens
import com.br.optheya_android.ui.theme.Gray100Color

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LoginPhoneScreen(navController: NavController) {
    Scaffold {
        MainLoginPhoneContent(navController)
    }
}

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
                    navController.popBackStack()
                }
            )
            HeadersLabelToScreens(
                title = stringResource(id = R.string.welcome_back),
                subtitle = stringResource(id = R.string.make_login_phone)
            )
            Column(
                modifier = Modifier
                    .padding(start = 15.dp, end = 15.dp)
            ) {
                EditText(
                    labelTitle = stringResource(id = R.string.phone),
                    labelPlaceholdder = stringResource(id = R.string.insert_phone_number),
                    keyboardType = KeyboardType.Phone
                )

                PrimaryButton(label = stringResource(id = R.string.send_code), onClick = {
                    navController.navigate(OnboardScreens.CodePhoneLoginScreen.name)
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