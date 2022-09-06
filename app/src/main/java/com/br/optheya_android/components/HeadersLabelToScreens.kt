package com.br.optheya_android.components

import androidx.activity.OnBackPressedCallback
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.optheya_android.ui.theme.Gray100Color
import com.br.optheya_android.R
import com.br.optheya_android.ui.theme.Actay
import com.br.optheya_android.ui.theme.Gray600Color
import com.br.optheya_android.ui.theme.Gray900Color

@Composable
fun HeadersLabelToScreens(title: String, subtitle: String){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(Gray100Color)
    ) {
       Column(
           modifier =
               Modifier
                   .fillMaxWidth()
                   .padding(start = 15.dp, end = 15.dp)
       ) {
           Text(
               modifier = Modifier
                   .fillMaxWidth(),
               text = title,
               fontFamily = Actay,
               fontWeight = FontWeight.W700,
               fontSize = 20.sp
           )
           Spacer(modifier = Modifier.height(4.dp))
           Text(
               modifier = Modifier
                   .fillMaxWidth(),
               text =subtitle,
               fontFamily = Actay,
                   fontWeight = FontWeight.W400,
               fontSize = 14.sp,
               color = Gray600Color
           )
       }
    }
}