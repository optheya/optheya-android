package com.br.optheya_android.screens.Search

import android.annotation.SuppressLint
import android.util.Log
import android.widget.RatingBar
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.br.optheya_android.R
import com.br.optheya_android.components.FindRestaurant
import com.br.optheya_android.components.TopBarSearchScreens
import com.br.optheya_android.models.Favorites
import com.br.optheya_android.models.Find
import com.br.optheya_android.models.Locale
import com.br.optheya_android.models.MenuItem
import com.br.optheya_android.ui.theme.*
import com.gowtham.ratingbar.RatingBar
import com.gowtham.ratingbar.RatingBarConfig
import com.gowtham.ratingbar.RatingBarStyle
import com.gowtham.ratingbar.StepSize
import java.lang.Math.ceil
import java.lang.Math.floor

@Composable
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
fun ResultSearchScreen(navController: NavController) {
    Scaffold() {
        MainResultSearchContent()
//        MainResultSearchContent(navController = navController)
    }
}

//TODO: Remover string para arquivo de strings

@Composable
@Preview
//fun MainFavoriteContent(navController: NavController) {
fun MainResultSearchContent() {

    val saved = arrayOf(
        Find(image = null, name = "Hamburgueria da Theya", address = "Rua da Theya, 123", avaliationRate = 4f, qtdReview = 12),
        Find(image = null, name = "Pizzaria da Theya", address = "Rua da Theya, 532", avaliationRate = 3.5f, qtdReview = 16),
        Find(image = null, name = "Açai da Theya", address = "Rua da Theya, 856", avaliationRate = 4.2f, qtdReview = 22),
        Find(image = null, name = "Pamonharia da Theya", address = "Rua da Theya, 009", avaliationRate = 5f, qtdReview =  78)
    )

    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Gray100Color
    ) {
        Column(
            modifier = Modifier
                .padding(start = 8.dp, end = 8.dp)
        ) {
            Spacer(modifier = Modifier.height(12.dp))
            TopBarSearchScreens(title = "Resultados")
            Spacer(modifier = Modifier.height(14.dp))
            FindRestaurant()
            Spacer(modifier = Modifier.height(25.dp))
            LazyColumn( ) {
               items(saved) { find ->
                   FoundRestaurant(find = find)
                   Spacer(modifier = Modifier.height(16.dp))
               }
            }
        }

    }
}

@Composable
fun FoundRestaurant(find: Find){
    val localeName by remember {
        mutableStateOf("")
    }
    val localeAddress by remember {
        mutableStateOf("")
    }

    var rating by remember {
        mutableStateOf(0.0f)
    }


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(228.dp)
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

            //TODO: Filter options

            Text(
                text = find.name,
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
                text = find.address, //VALOR A SER PASSADO EM UM REMEMBER
                fontFamily = Actay,
                fontSize = 14.sp,
                fontWeight = FontWeight.W400,
                textAlign = TextAlign.Left,
                color = Gray800Color,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 23.dp, top = 8.dp)
            )

//            Column(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(top = 8.dp, start = 10.dp)
//            ) {
//                Row(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.coin),
//                        contentDescription = "COIN",
//                        modifier = Modifier
//                            .height(22.dp)
//                            .width(22.dp)
//                    )
//                    Spacer(modifier = Modifier.width(4.dp))
//                    Text(
//                        text = "+100 Theyas",
//                        fontFamily = Actay,
//                        fontSize = 14.sp,
//                        fontWeight = FontWeight.W400,
//                        textAlign = TextAlign.Left,
//                        color = Gray600Color
//
//                    )
//                    Column(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(end = 17.dp),
//                        verticalArrangement = Arrangement.Bottom,
//                        horizontalAlignment = Alignment.End
//                    ) {
//                        RatingBar(
//                            value = rating,
//                            config = RatingBarConfig()
//                                .activeColor(Color.Yellow)
//                                .inactiveColor(Color.LightGray)
//                                .stepSize(StepSize.HALF)
//                                .size(16.dp)
//                                .padding(1.dp)
//                                .style(RatingBarStyle.Normal),
//                            onValueChange = {
//                                rating = it
//                            },
//                            onRatingChanged = {
//                                Log.d("TAG", "onRatingChanged: $it")
//                            }
//                        )
//
//                        Text(
//                            text = "10" +  " Reviews", //VALOR A SER PASSADO EM UM REMEMBER
//                            fontFamily = Actay,
//                            fontSize = 14.sp,
//                            fontWeight = FontWeight.W400,
//                            textAlign = TextAlign.Left,
//                            color = Gray600Color
//                        )
//
//                    }
//
//                }
//
//            }
        }
    }
}