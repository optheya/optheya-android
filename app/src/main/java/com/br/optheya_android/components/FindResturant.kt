package com.br.optheya_android.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.optheya_android.R
import com.br.optheya_android.ui.theme.Actay
import com.br.optheya_android.ui.theme.Gray500Color
import com.br.optheya_android.ui.theme.WhiteColor

@Composable
fun FindRestaurant() {
    var whatsChose by remember {
        mutableStateOf("")
    }
    TextField(
        value = whatsChose,
        onValueChange = {

        },
        placeholder = {
            Text(
                text = "Busque por restaurantes",
                fontFamily = Actay,
                fontWeight = FontWeight.W400,
                fontSize = 14.sp
            )
        },
        trailingIcon = {
            Image(
                painter = painterResource(id = R.drawable.vector_lupa),
                contentDescription = "Busque por restaurantes"
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = WhiteColor,
            textColor = Gray500Color,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(10.dp)
    )
}