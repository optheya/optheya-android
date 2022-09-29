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
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.End
                ) {
                    MapBtn(
                        onClick = { }
                    )
                }
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

@Composable
fun BtnFindCards() {
    Card(
        modifier = Modifier
            .fillMaxWidth(.5f)
            .height(90.dp),
        backgroundColor = PrimaryCrystalClearColor,
        shape = RoundedCornerShape(20.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(painter = painterResource(id = R.drawable.bottom_decor), contentDescription = "btn decr")
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 16.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.ic_search), contentDescription = "lupa")
                Spacer(modifier = Modifier.height(29.dp))
                Text(
                    text = "Buscar",
                    fontFamily = Actay,
                    fontWeight = FontWeight.W700,
                    fontSize = 14.sp
                )
            }
        }

    }
}

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