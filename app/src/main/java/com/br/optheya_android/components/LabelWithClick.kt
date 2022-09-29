package com.br.optheya_android.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import com.br.optheya_android.ui.theme.Actay
import com.br.optheya_android.ui.theme.Gray600Color

@Composable
fun LabelWithClick(label: String, clicable: String, onClick: () -> Unit){
   Column(
       modifier = Modifier
           .fillMaxWidth(),
   ) {
       Row() {
           Text(
               text = label,
               fontFamily = Actay,
               fontWeight = FontWeight.W400,
               fontSize = 14.sp,
               color = Gray600Color,
               textAlign = TextAlign.Center
           )
           
           Text(
               text = clicable,
               Modifier.clickable(
                   enabled = true,
                   onClick = onClick
               ) ,
               fontFamily = Actay,
               fontWeight = FontWeight.W400,
               fontSize = 14.sp,
               color = Gray600Color,
               textAlign = TextAlign.Center,
               textDecoration = TextDecoration.Underline
           )
       }
   }
}