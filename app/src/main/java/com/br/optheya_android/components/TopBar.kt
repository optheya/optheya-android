package com.br.optheya_android.components

import androidx.activity.OnBackPressedCallback
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.br.optheya_android.ui.theme.Gray100Color
import com.br.optheya_android.R
import com.br.optheya_android.ui.theme.Gray900Color

@Composable
@Preview
fun TopBar(){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
            .background(Gray100Color)
    ) {
        Row() {
            IconButton(
                onClick = {

                },
            ){
                Icon(
                    Icons.Filled.ArrowBack,
                    "contentDescription",
                    tint = Gray900Color)
            }
        }
    }
}