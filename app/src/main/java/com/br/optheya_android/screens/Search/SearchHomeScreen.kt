package com.br.optheya_android.screens.Search

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.optheya_android.R
import androidx.navigation.NavController
import com.br.optheya_android.components.BtnFavoriteCards
import com.br.optheya_android.components.BtnFindCards
import com.br.optheya_android.components.BtnRequestsCards
import com.br.optheya_android.ui.theme.*

@Composable
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
fun SearchHomeScreen(navController: NavController) {
    Scaffold() {
        MainSearchHomeContent()
//        MainSearchHomeContent(navController = navController)
    }
}

//TODO: Remover string para arquivo de strings

@Composable
@Preview
//fun MainSearchHomeContent(navController: NavController) {
fun MainSearchHomeContent() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Gray100Color
    ) {
        Column(
            modifier = Modifier
                .padding(start = 8.dp, end = 8.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 49.dp, bottom = 40.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Busque experiências!",
                    fontFamily = Actay,
                    fontWeight = FontWeight.W700,
                    fontSize = 20.sp
                )
            }

            Row {
                BtnFindCards()
                Spacer(modifier = Modifier.width(8.dp))
                BtnFavoriteCards()
            }
            Spacer(modifier = Modifier.height(2.dp))
            Column {
                BtnRequestsCards()
            }
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MapBtn(onClick: () -> Unit, modifier: Modifier = Modifier){
    Card(
        onClick = onClick,
        modifier = Modifier
            .height(48.dp)
            .width(48.dp),
        shape = RoundedCornerShape(15.dp),
        backgroundColor = WhiteColor,
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_map),
            contentDescription = "MAPA",
            modifier = Modifier
                .padding(15.dp)
        )
    }
}