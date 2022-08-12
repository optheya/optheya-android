package com.br.optheya_android.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.br.optheya_android.R

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)

val Actay = FontFamily(
    Font(R.font.actayc_condensed_thin, weight = FontWeight.Thin),
    Font(R.font.actay_condensed_thin_italic, weight = FontWeight.Thin, style = FontStyle.Italic ),
    Font(R.font.actay_regular),
    Font(R.font.actay_regular_italic, style = FontStyle.Italic),
    Font(R.font.actay_wide_bold, weight = FontWeight.Bold),
    Font(R.font.actay_wide_bold_italic, weight = FontWeight.Bold, style = FontStyle.Italic),
)

val Kuryen = FontFamily(
    Font(R.font.kurye_light, weight = FontWeight.Light),
    Font(R.font.kurye_light_italic, weight = FontWeight.Light, style = FontStyle.Italic)
)