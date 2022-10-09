package com.br.optheya_android.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.br.optheya_android.ui.theme.Gray500Color
import com.br.optheya_android.ui.theme.Gray800Color
import com.br.optheya_android.ui.theme.WhiteColor

@Composable
@Preview
fun CodeVerifierField(){

    var field1 by remember { mutableStateOf("") }
    var field2 by remember { mutableStateOf("") }
    var field3 by remember { mutableStateOf("") }
    var field4 by remember { mutableStateOf("") }

    val focusManager = LocalFocusManager.current

    //TODO: PULAR ASSIM QUE DIGITAR O NUMERO
    Row(
        modifier = Modifier
            .background(Color.Transparent)
    ) {
        OutlinedTextField(
            value = field1,
            onValueChange = {
                if (it.length <= 1) {
                    field1 = it
                }
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
            singleLine = true,
            enabled = true,
//            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions (
                onNext = {
                    focusManager.moveFocus(FocusDirection.Next)
                }
            )
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
            singleLine = true,
            enabled = true
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