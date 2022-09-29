package com.br.optheya_android.screens

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
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
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import com.br.optheya_android.ui.theme.Gray100Color
import com.br.optheya_android.R
import com.br.optheya_android.components.*
import com.br.optheya_android.ui.theme.Actay
import com.br.optheya_android.ui.theme.PurpleSolidColor

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun PolicyPrivacityScreen(navController: NavController, context: Context) {
    Scaffold {
        MainPolicyPrivacityContent(navController = navController, context = context)
    }
}

//TODO: Remover string para arquivo de strings


@Composable
fun MainPolicyPrivacityContent(navController: NavController, context: Context) {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Gray100Color
    ) {
        Column {
            TopBar(
                onClick = {
                    Log.d("TOPBAR", "MainPolicyPrivacityContent: Bck clicket")
                }
            )
            HeadersLabelToScreens(
                title = "Politicas de Privacidade",
                subtitle = ""
            )
            Column(
                modifier = Modifier
                    .padding(start = 15.dp, end = 15.dp)
            ) {


                LoadUrl(url = "https://karonty.tech/", context = context) //TODO: PASSAR A URL DO TERMOS

                PrimaryButton(label = "Aceitar e continuar") {
                    Log.d("ACEITAR ECONTINUAR", "MainUseTermsContent: acc and cont clicket")
                }
            }
        }
    }
}