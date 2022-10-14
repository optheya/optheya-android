package com.br.optheya_android.components

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.optheya_android.screens.search.BackBtn
import com.br.optheya_android.ui.theme.Actay
import com.br.optheya_android.ui.theme.Gray900Color

@Composable
fun TopBarSearchScreens(title: String){
    Spacer(modifier = Modifier.height(14.dp))
    Row (
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        BackBtn(onClick = {
            Log.d("TAG", "MainFavoriteContent: BACK")
        })
        Text(
            text = title,
            fontFamily = Actay,
            fontSize = 20.sp,
            fontWeight = FontWeight.W700,
            textAlign = TextAlign.Left,
            color = Gray900Color,
            modifier = Modifier
                .padding(start = 26.dp)
        )
    }
}