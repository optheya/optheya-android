package com.br.optheya_android.screens.onboarding

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.br.optheya_android.R
import com.br.optheya_android.components.HeadersLabelToScreens
import com.br.optheya_android.components.LoadUrl
import com.br.optheya_android.components.PrimaryButton
import com.br.optheya_android.components.TopBar
import com.br.optheya_android.ui.theme.Gray100Color

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun UseTermsScreen(navController: NavController, context: Context) {
    Scaffold {
        MainUseTermsContent(navController = navController, context = context)
    }
}

@Composable
fun MainUseTermsContent(navController: NavController, context: Context) {
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
                title = stringResource(id = R.string.use_terms),
                subtitle = stringResource(id = R.string.string_nula)
            )
            Column(
                modifier = Modifier
                    .padding(start = 15.dp, end = 15.dp)
            ) {


                LoadUrl(url = "https://karonty.tech/", context = context) //TODO: PASSAR A URL DO TERMOS

                PrimaryButton(label = stringResource(id = R.string.acc_and_continue)) {
                    Log.d("ACEITAR ECONTINUAR", "MainUseTermsContent: acc and cont clicket")
                }
            }
        }
    }
}