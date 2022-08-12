package com.br.optheya_android.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import coil.size.Scale
import com.br.optheya_android.R
import com.br.optheya_android.models.Tutorial
import com.br.optheya_android.ui.theme.Actay
import com.br.optheya_android.ui.theme.Gray400Color
import com.br.optheya_android.ui.theme.WhiteColor
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun SliderView(
    state: PagerState,
    itens: Array<Tutorial>
) {
    HorizontalPager(
        state = state,
        count = itens.size,
        modifier = Modifier
            .fillMaxHeight(0.9f)
            .fillMaxWidth()
    ) { page ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.gitlswithdog),
                contentDescription = stringResource(id = R.string.contentDescTheya),
                Modifier
                    .padding(start = 38.dp,end = 38.dp)
                    .fillMaxWidth()
                    .height(296.dp)


            )
            Text(
                text = itens[page].title,
                color = WhiteColor,
                fontFamily = Actay,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 27.dp, end = 14.5f.dp, start = 14.5f.dp, bottom = 12.dp)
                    .width(291.dp)
            )
            Text(
                text = itens[page].subtitle,
                color = Gray400Color,
                fontFamily = Actay,
                fontWeight = FontWeight.W400,
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(end = 12.5f.dp, start = 12.5f.dp, bottom = 116.dp)
                    .width(295.dp)
            )
        }
    }
}