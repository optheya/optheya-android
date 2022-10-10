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
import com.br.optheya_android.ui.theme.SecundaryPrincipalColor

@Composable
fun BtnFavoriteCards() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp),
        backgroundColor = SecundaryPrincipalColor,
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
                    painter = painterResource(id = R.drawable.ic_union),
                    contentDescription = "btn decr"
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 16.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.ic_hearth), contentDescription = "lupa")
                Spacer(modifier = Modifier.height(29.dp))
                Text(
                    text = "Favoritos",
                    fontFamily = Actay,
                    fontWeight = FontWeight.W700,
                    fontSize = 14.sp
                )
            }
        }

    }
}
