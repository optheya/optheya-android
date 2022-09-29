package com.br.optheya_android.screens.onboarding

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
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
                   navController.popBackStack()
                }
            )
            Spacer(modifier = Modifier.height(24.dp))
            HeadersLabelToScreens(
                title = stringResource(id = R.string.forgot_you_pass),
                subtitle = stringResource(id = R.string.select_recovery_form)
            )
            LargeButtonWithIcon(label = stringResource(id = R.string.sms_form), icon = R.drawable.ic_icon_rec_sms) {
                navController.navigate(OnboardScreens.InsertACodeRecoveryScreen.name)
            }

            LargeButtonWithIcon(label = stringResource(id = R.string.email_form), icon = R.drawable.ic_icon_rec_email) {
                navController.navigate(OnboardScreens.InsertACodeRecoveryScreen.name)
            }
        }
    }
}