package com.br.optheya_android.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.optheya_android.R
import com.br.optheya_android.ui.theme.*

@Composable
fun BackgroundOnboarding(label:String){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        PrimaryPrincipalColor,
                        PrimaryPrincipalColor,
                        PrimaryCrystalClearColor
                    ),
                )
            )
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .padding(start = 130.dp, end = 130.dp, top = 49.1f.dp)
                    .height(44.dp)
                    .width(60.dp),
                painter = painterResource(id = R.drawable.logowithe),
                contentDescription = stringResource(id = R.string.contentDescLogo)
            )
            Text(
                modifier = Modifier
                    .padding(top = 14.dp),
                text = stringResource(id = R.string.app_name),
                fontFamily = Actay,
                fontWeight = FontWeight.W700,
                fontSize = 24.sp,
                color = WhiteColor
            )
            Text(
                modifier = Modifier
                    .padding(start = 43.dp, end = 43.dp, top = 38.dp)
                    .width(234.dp),
                text = label,
                fontFamily = Actay,
                fontWeight = FontWeight.W400,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                color = Gray300Color
            )
        }
    }
}