package com.br.optheya_android.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.optheya_android.R
import com.br.optheya_android.ui.theme.*

@Composable
fun CodeVerifierField(){

    var field1 by remember { mutableStateOf("") }
    var field2 by remember { mutableStateOf("") }
    var field3 by remember { mutableStateOf("") }
    var field4 by remember { mutableStateOf("") }
    //TODO: PULAR ASSIM QUE DIGITAR O NUMERO
    Row(
        modifier = Modifier
            .background(Color.Transparent)
    ) {
        OutlinedTextField(
            value = field1,
            onValueChange = {
                if (it.length <= 1)field1 = it

            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = WhiteColor,
                textColor = Gray500Color,
                focusedBorderColor = Gray800Color
            ),
            modifier = Modifier
                .width(50.dp),
            shape = RoundedCornerShape(10.dp),
            singleLine = true
        )
        Spacer(modifier = Modifier.width(12.dp))

        //----------------------------------------------------
        OutlinedTextField(
            value = field2,
            onValueChange = {
                if (it.length <= 1) field2 = it

            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = WhiteColor,
                textColor = Gray500Color,
                focusedBorderColor = Gray800Color
            ),
            modifier = Modifier
                .width(50.dp),
            shape = RoundedCornerShape(10.dp),
            singleLine = true
        )
        Spacer(modifier = Modifier.width(12.dp))

        //----------------------------------------------------
        OutlinedTextField(
            value = field3,
            onValueChange = {
                if (it.length <= 1) field3 = it

            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = WhiteColor,
                textColor = Gray500Color,
                focusedBorderColor = Gray800Color
            ),
            modifier = Modifier
                .width(50.dp),
            shape = RoundedCornerShape(10.dp),
            singleLine = true
        )
        Spacer(modifier = Modifier.width(12.dp))

        //----------------------------------------------------
        OutlinedTextField(
            value = field4,
            onValueChange = {
                if (it.length <= 1) field4 = it

            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = WhiteColor,
                textColor = Gray500Color,
                focusedBorderColor = Gray800Color
            ),
            modifier = Modifier
                .width(50.dp),
            shape = RoundedCornerShape(10.dp),
            singleLine = true
        )
    }
}