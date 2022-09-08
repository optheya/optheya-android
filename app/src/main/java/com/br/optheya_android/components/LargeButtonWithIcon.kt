package com.br.optheya_android.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.optheya_android.R
import com.br.optheya_android.ui.theme.Actay
import com.br.optheya_android.ui.theme.Gray800Color
import com.br.optheya_android.ui.theme.WhiteColor

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun LargeButtonWithIcon(label: String, icon: Int, onClick: () -> Unit){
    Card(
        onClick = onClick,
        backgroundColor = WhiteColor,
        modifier = Modifier
            .fillMaxWidth()
            .height(73.dp)
            .padding(horizontal = 20.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = 20.dp

        ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = null,
                alignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 16.dp, top = 8.5f.dp, bottom = 8.5f.dp)
            )
            Spacer(modifier = Modifier.width(28.dp))
            Text(
                text = label,
                fontFamily = Actay,
                fontWeight = FontWeight.W400,
                fontSize = 14.sp,
                color = Gray800Color
            )
        }
    }
    Spacer(modifier = Modifier.height(24.dp))
}