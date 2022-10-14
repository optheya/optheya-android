package com.br.optheya_android.screens.search

import android.annotation.SuppressLint
import android.app.Activity
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.br.optheya_android.ui.theme.Gray100Color
import com.google.ar.core.ArCoreApk

@Composable
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
fun ARMenuScreen(navController: NavController) {
    Scaffold() {
        MainARMenuContent()
//        MainARMenuContent(navController = navController)
    }
}

//TODO: Remover string para arquivo de strings

@Composable
@Preview
//fun MainARMenuContent(navController: NavController) {
fun MainARMenuContent() {

    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Gray100Color
    ) {
        Column(
            modifier = Modifier
                .padding(start = 8.dp, end = 8.dp)
        ) {

        }

    }
}