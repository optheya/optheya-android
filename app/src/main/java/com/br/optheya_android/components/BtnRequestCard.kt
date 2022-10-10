package com.br.optheya_android.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.optheya_android.R
import com.br.optheya_android.ui.theme.Actay
import com.br.optheya_android.ui.theme.AlertColor
import com.br.optheya_android.ui.theme.Gray500Color

@Composable
fun BtnRequestsCards() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp),
        backgroundColor = AlertColor,
        shape = RoundedCornerShape(20.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_circle_over),
                    contentDescription = "btn decr"
                )
            }
            Column(
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(top = 16.dp, start = 16.dp, bottom = 19.dp)
            ) {
                Text(
                    text = "Meus pedidos",
                    fontFamily = Actay,
                    fontWeight = FontWeight.W700,
                    fontSize = 14.sp
                )
            }

            Column(
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(top = 16.dp, end = 20.dp, bottom = 19.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.ic_mkt_kart), contentDescription = "lupa")
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "0", //TODO: vai receber do back esse valor
                    fontFamily = Actay,
                    fontWeight = FontWeight.W700,
                    fontSize = 14.sp,
                    color = Gray500Color
                )
            }
        }

    }
}