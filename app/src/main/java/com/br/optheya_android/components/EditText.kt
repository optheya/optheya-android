package com.br.optheya_android.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.optheya_android.R
import com.br.optheya_android.ui.theme.*

@Composable
fun EditText(
    labelTitle: String,
    labelPlaceholdder: String,
    showStartIcon:Boolean = false,
    showEndIcon: Boolean = false,
    icon: Int = 0,
    keyboardType: KeyboardType
    ){
    var textByUser by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .background(Color.Transparent)
    ) {
        Text(
            text = labelTitle,
            color = PrimaryPrincipalColor,
            fontFamily = Actay,
            fontWeight = FontWeight.W400,
            fontSize = 14.sp
        )
        Spacer(modifier = Modifier.height(5.dp))
        OutlinedTextField(
            value = textByUser,
            onValueChange = {
                textByUser = it
            },
            keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
            placeholder = {
                Text(
                    text = labelPlaceholdder,
                    fontFamily = Actay,
                    fontWeight = FontWeight.W400,
                    fontSize = 14.sp
                )
            },
            trailingIcon = {
                if (showEndIcon){
                    Image(
                        painter = painterResource(id = icon),
                        contentDescription = stringResource(id = R.string.choose_xp)
                    )
                }
            },
            leadingIcon = {
                if (showStartIcon){
                    Image(
                        modifier = Modifier
                            .height(0.dp)
                            .width(0.dp),
                        painter = painterResource(id = icon),
                        contentDescription = stringResource(id = R.string.choose_xp)
                    )
                }
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = WhiteColor,
                textColor = Gray500Color,
                focusedBorderColor = Gray800Color
            ),
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp)
        )
    }
}