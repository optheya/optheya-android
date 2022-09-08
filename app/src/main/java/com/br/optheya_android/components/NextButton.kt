package com.br.optheya_android.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.br.optheya_android.R
import com.br.optheya_android.ui.theme.SelectedBulletColor

//TODO: FAZER CLICK DO BOTAÃO
@Composable
fun NextButton(){
    Card(
        modifier = Modifier
            .height(62.dp)
            .width(62.dp),
        backgroundColor = SelectedBulletColor,
        shape = RoundedCornerShape(
            corner = CornerSize(
                size = 40.dp
            )
        )
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.arrow_left_ic),
                contentDescription = "",
                modifier = Modifier
                    .height(16.dp)
                    .width(16.dp),
            )
        }
    }
}