package com.br.optheya_android.screens

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.br.optheya_android.R
import com.br.optheya_android.components.DotsIndicator
import com.br.optheya_android.components.NextButton
import com.br.optheya_android.components.SliderView
import com.br.optheya_android.models.Tutorial
import com.br.optheya_android.ui.theme.Actay
import com.br.optheya_android.ui.theme.PrimaryPrincipalColor
import com.br.optheya_android.ui.theme.SelectedBulletColor
import com.br.optheya_android.ui.theme.WhiteColor
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TutorialScreen(navController: NavController, skipTutorial: String) {
    Scaffold {
        MainTutorialContent(navController = navController, skipTutorial = skipTutorial)
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainTutorialContent(navController: NavController, skipTutorial: String) {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = PrimaryPrincipalColor
    ) {
        val state = rememberPagerState()

        val tutorials = arrayOf(
            Tutorial("Hey, eu sou a Theya! Vamos conhecer novos restaurantes?", "Explore a cidade, conheça novos restaurantes, faça pedidos  e ganhe pontos!", img = R.drawable.theya1),
            Tutorial("Acompanhe o andamento do pedido pelo app", "Nada de filas e atendimentos demorados! Com optheya você tem todo o processo de pedido  na palma da mão!", img = R.drawable.theya2),
            Tutorial("Restaurantes de qualidade na palma da mão!", "Alguns dos nossos parceiros contam com a Realidade Aumentada, assim você poderá ver todo o cardápio em 3d!", img = R.drawable.theya3),
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ) {
                    TextButton(
                        onClick = { navController.navigate(skipTutorial) },
                    ) {
                        Text(
                            text = "Pular",
                            color = WhiteColor,
                            fontSize = 14.sp,
                            fontFamily = Actay,
                            fontWeight = FontWeight.W400,
                            textAlign = TextAlign.End
                        )
                    }
                }
            }
            
            SliderView(
                state = state,
                itens = tutorials
            )
            Column(
                modifier = Modifier
                    .padding(start = 30.dp)
            ) {
                DotsIndicator(
                    totalDots = tutorials.size,
                    selectedIndex = state.currentPage
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 37.dp, bottom = 45.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.End
        ) {
            NextButton {
                Log.d("TUTORIAL NEXT BTN", "MainTutorialContent: NextClicked")
            }
        }
    }
}