package com.br.optheya_android.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.br.optheya_android.ui.theme.Actay
import com.br.optheya_android.ui.theme.Gray600Color

@Composable
fun LabelWithClick(label: String, linkLabel: String){
    Text(
        modifier = Modifier
            .fillMaxWidth(),
        text = buildAnnotatedString {
            append(label)
            withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)) {
                append(linkLabel)
            } //TODO: ADD A ONLCICK TO LINK
        },
        fontFamily = Actay,
        fontWeight = FontWeight.W400,
        fontSize = 14.sp,
        color = Gray600Color,
        textAlign = TextAlign.Center
    )
}