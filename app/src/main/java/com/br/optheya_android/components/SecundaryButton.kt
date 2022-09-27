package com.br.optheya_android.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.optheya_android.R
import com.br.optheya_android.navigation.OnboardScreens
import com.br.optheya_android.ui.theme.Actay
import com.br.optheya_android.ui.theme.Gray100Color
import com.br.optheya_android.ui.theme.PrimaryPrincipalColor
import com.br.optheya_android.ui.theme.WhiteColor

@Composable
fun SecundaryButton(label: String, modifier: Modifier = Modifier, onClick: () -> Unit){
    Button(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(Gray100Color),
        border = BorderStroke(width = 1.dp, color = PrimaryPrincipalColor),
        shape = RoundedCornerShape(
            corner = CornerSize(
                size = 8.dp
            )
        )
    ) {
        Text(
            text = label,
            fontFamily = Actay,
            fontWeight = FontWeight.W400,
            fontSize = 16.sp,
            color = PrimaryPrincipalColor
        )
    }
}