package com.br.optheya_android.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.br.optheya_android.ui.theme.SelectedBulletColor
import com.br.optheya_android.ui.theme.WhiteColor

@Composable
fun DotsIndicator(
    totalDots: Int,
    selectedIndex: Int,
) {

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.Bottom
    ) {

        items(totalDots) { index ->
            if (index == selectedIndex) {
                Box(
                    modifier = Modifier
                        .width(17.dp)
                        .height(4.dp)
                        .clip(CircleShape)
                        .background(color = SelectedBulletColor)
                )
            } else {
                Box(
                    modifier = Modifier
                        .width(4.dp)
                        .height(4.dp)
                        .clip(CircleShape)
                        .background(color = WhiteColor)
                )
            }

            if (index != totalDots - 1) {
                Spacer(modifier = Modifier.padding(horizontal = 4.dp))
            }
        }
    }
}