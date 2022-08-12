package com.br.optheya_android.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.br.optheya_android.R
import com.br.optheya_android.ui.theme.PrimaryPrincipalColor

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SplashScreen(navController: NavController) {
    Scaffold {
        MainSplashContent(navController)
    }
}


@Composable
fun MainSplashContent(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = PrimaryPrincipalColor
    ) {
        Image(
            painter = painterResource(id = R.drawable.logowithe),
            contentDescription = stringResource(id = R.string.contentDescLogo),
            modifier = Modifier
                .padding(
                    start = 110.dp,
                    top = 320.dp,
                    end = 110.dp,
                    bottom = 320.dp
                )
        )
    }
}
