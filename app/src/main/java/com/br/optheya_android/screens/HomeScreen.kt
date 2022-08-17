package com.br.optheya_android.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.br.optheya_android.R
import com.br.optheya_android.models.Locale
import com.br.optheya_android.models.Mission
import com.br.optheya_android.models.Reward
import com.br.optheya_android.models.Tutorial
import com.br.optheya_android.ui.theme.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold {
//        MainHomeContent(navController)
        MainHomeContent()
    }
}

@Composable
@Preview
//fun MainHomeContent(navController: NavController) {
fun MainHomeContent() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Gray100Color
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            Header()
            
            Text(
                text = "Faça login para explorar mais!",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        top = 32.dp
                    ),
                fontFamily = Actay,
                fontSize = 16.sp,
                fontWeight = FontWeight.W700,
                textAlign = TextAlign.Left,
                color = Gray800Color
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 26.33f.dp, top = 10.dp)
            ) {
                ActiveLocation()
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp, top = 20.dp)
            ) {
                ChooseExperiences()

            }

            SectionTitle("Experiências por perto")

            val locales = arrayOf(
                Locale("Restaurante da Theya", "Rua da Theya, 123"),
                Locale("Restaurante da LLL", "Rua da LLL, 43Q2"),
                Locale("Restaurante da SSS", "Rua da SSS, 1423"),
                Locale("Restaurante da FFF", "Rua da FFF, 432")
            )

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 23.dp, top = 16.dp)
            ) {
                items(items = locales, itemContent = { item ->
                    Experience(locale = item)
                })
            }
            
            SectionTitle("Missões")

            val mission = arrayOf(
                Mission("Visitar 2 lojas em um dia", "100 Theyas"),
                Mission("Visitar  2 Pizzarias em 1 dia", "200 Theyas"),
                Mission("Fazer 2 pedidos", "200 Theyas"),
                Mission("Comer em um restaurante", "10 Theyas")
            )

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 23.dp, top = 16.dp)
            ) {
                items(items = mission, itemContent = { item ->
                    Mission(mission = item)
                })
            }


            SectionTitle("Recompensas")

            val rewards = arrayOf(
                Reward("20% de desconto", "Hamburgueria da Theya", "-2.000 Theyas"),
                Reward("1 Hamburguer", "Hamburgueria da Theya", "-1.000 Theyas"),
                Reward("2 Espetinho", "Espetinho da Theya", "-2.400 Theyas"),
            )

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 23.dp, top = 16.dp)
            ) {
                items(items = rewards, itemContent = { item ->
                    Reward(reward = item)
                })
            }

        }
    }
}

@Composable
fun SectionTitle(title: String) {
    Text(
        text = title,
        fontFamily = Actay,
        fontSize = 20.sp,
        fontWeight = FontWeight.W700,
        textAlign = TextAlign.Left,
        color = Gray800Color,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 25.dp)
    )
}

@Composable
fun ChooseExperiences() {
    var whatsChose by remember {
        mutableStateOf("")
    }
    TextField(
        value = whatsChose,
        onValueChange = {

        },
        placeholder = {
            Text(
                text = stringResource(id = R.string.choose_xp),
                fontFamily = Actay,
                fontWeight = FontWeight.W400,
                fontSize = 14.sp
            )
        },
        trailingIcon = {
            Image(
                painter = painterResource(id = R.drawable.vector_lupa),
                contentDescription = stringResource(id = R.string.choose_xp)
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = WhiteColor,
            textColor = Gray500Color,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(10.dp)
    )
}

@Composable
fun Header(){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(64.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(
                    top = 19.dp,
                    start = 20.dp,
                    bottom = 19.dp
                ),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
        ) {
           CashHome()
        }
        Row(
            modifier = Modifier
                .padding(
                    top = 10.dp,
                    end = 20.dp,
                    bottom = 10.dp
                ),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ProfileImage()
        }
    }
}

@Composable
fun CashHome(){
    Card(
        modifier = Modifier
            .width(57.dp)
            .height(26.dp),
        shape = RoundedCornerShape(6.dp),
        backgroundColor = PrimaryCrystalClearColor
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_purple),
                contentDescription = stringResource(id = R.string.contentDescLogo),
                modifier = Modifier
                    .padding(
                        start = 8.dp,
                        top = 4.5f.dp,
                        bottom = 4.5f.dp,
                        end = 8.dp
                    )
            )
            Text(
                text = "0", //DEVE SER UM REMEMBER
                modifier = Modifier
                    .padding(
                        end = 8.dp,
                        top = 1.dp,
                        bottom = 1.dp
                    )
                    .height(24.dp)
                    .width(11.dp),
                fontFamily = Actay,
                fontWeight = FontWeight.W400,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                color = PrimaryPrincipalColor
            )
        }
    }
}

@Composable
fun ProfileImage(){
    Image(
        painter = painterResource(R.drawable.woman),
        contentDescription = stringResource(id = R.string.avatar),
        modifier = Modifier
            .height(44.dp)
            .width(44.dp)
            .clip(
                shape = RoundedCornerShape(100.dp)
            ),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun ActiveLocation(){
    TextButton(
        onClick = { /*TODO*/ }
    ) {
        Image(
            modifier = Modifier
                .padding(end = 3.33f.dp, start = 0.dp),
            painter = painterResource(id = R.drawable.location_icon),
            contentDescription = stringResource(id = R.string.continue_with_google)
        )

        Text(
            text = stringResource(id = R.string.active_location),
            fontFamily = Actay,
            fontWeight = FontWeight.W400,
            fontSize = 16.sp,
            color = PrimaryPrincipalColor,
            textDecoration = TextDecoration.Underline
        )
    }
}

@Composable
fun Experience(locale: Locale){
    val localeName by remember {
        mutableStateOf("")
    }
    val localeAddress by remember {
        mutableStateOf("")
    }
        Card(
            modifier = Modifier
                .width(216.dp)
                .height(252.dp)
                .padding(start = 6.dp, end = 6.dp),
            shape = RoundedCornerShape(16.dp),
            elevation = 6.dp
        ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.food),
                        contentDescription = "EXAMPLE",
                        modifier = Modifier
                            .fillMaxHeight(.5f)
                            .fillMaxWidth(),
                        alignment = Alignment.TopCenter,
                        contentScale = ContentScale.Crop
                    )

                    Text(
                        text = locale.name,
                        //VALOR A SER PASSADO EM UM REMEMBER
                        fontFamily = Actay,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W700,
                        textAlign = TextAlign.Left,
                        color = Gray800Color,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 8.dp, end = 23.dp, top = 24.dp)
                    )

                    Text(
                        text = locale.address, //VALOR A SER PASSADO EM UM REMEMBER
                        fontFamily = Actay,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W400,
                        textAlign = TextAlign.Left,
                        color = Gray800Color,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 8.dp, end = 23.dp, top = 8.dp)
                    )


                }

        }

}


@Composable
fun Mission(mission: Mission){
    val localeName by remember {
        mutableStateOf("")
    }
    val localeAddress by remember {
        mutableStateOf("")
    }
    Card(
        modifier = Modifier
            .width(151.dp)
            .height(120.dp)
            .padding(start = 6.dp, end = 6.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = 6.dp,
        backgroundColor = PrimaryCrystalClearColor
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = mission.title,
                //VALOR A SER PASSADO EM UM REMEMBER
                fontFamily = Actay,
                fontSize = 14.sp,
                fontWeight = FontWeight.W700,
                textAlign = TextAlign.Left,
                color = Gray800Color,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, top = 17.dp, bottom = 12.dp)
            )

            Divider(
                color = Gray100Color,
                modifier = Modifier
                    .padding(start = 4.dp, end = 4.dp)
            )

            Text(
                text = mission.reward, //VALOR A SER PASSADO EM UM REMEMBER
                fontFamily = Actay,
                fontSize = 12.sp,
                fontWeight = FontWeight.W400,
                textAlign = TextAlign.Left,
                color = Gray800Color,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 6.dp, end = 6.dp, top = 16.dp)
            )


        }

    }

}

@Composable
fun Reward(reward: Reward){
    val localeName by remember {
        mutableStateOf("")
    }
    val localeAddress by remember {
        mutableStateOf("")
    }
    Card(
        modifier = Modifier
            .width(216.dp)
            .height(112.dp)
            .padding(start = 6.dp, end = 6.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = 6.dp,
        backgroundColor = WhiteColor
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = reward.percent,
                //VALOR A SER PASSADO EM UM REMEMBER
                fontFamily = Actay,
                fontSize = 16.sp,
                fontWeight = FontWeight.W700,
                textAlign = TextAlign.Left,
                color = Gray800Color,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, top = 17.dp, bottom = 12.dp)
            )

            Text(
                text = reward.local, //VALOR A SER PASSADO EM UM REMEMBER
                fontFamily = Actay,
                fontSize = 14.sp,
                fontWeight = FontWeight.W400,
                textAlign = TextAlign.Left,
                color = Gray800Color,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 40.dp, top = 8.dp)
            )

            Text(
                text = reward.price, //VALOR A SER PASSADO EM UM REMEMBER
                fontFamily = Actay,
                fontSize = 14.sp,
                fontWeight = FontWeight.W400,
                textAlign = TextAlign.Left,
                color = Gray800Color,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end =85.dp)
            )
        }

    }

}