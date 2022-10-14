package com.br.optheya_android.screens.search

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.optheya_android.R
import androidx.navigation.NavController
import com.br.optheya_android.components.FindRestaurant
import com.br.optheya_android.components.TopBarSearchScreens
import com.br.optheya_android.models.MenuItem
import com.br.optheya_android.ui.theme.*

@Composable
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
fun SearchMenuScreen(navController: NavController) {
    Scaffold() {
        MainSearchMenuContent()
//        MainSearchMenuContent(navController = navController)
    }
}

//TODO: Remover string para arquivo de strings

@Composable
@Preview
//fun MainSearchMenuContent(navController: NavController) {
fun MainSearchMenuContent() {

    val menu = arrayOf(
        MenuItem(itemName = "Hamburguer", icon = R.drawable.menu_hamb),
        MenuItem(itemName = "Padarias e Cafeterias", icon = R.drawable.menu_hamb),
        MenuItem(itemName = "Doces e Bolos", icon = R.drawable.menu_hamb),
        MenuItem(itemName = "Japonesa", icon = R.drawable.menu_hamb),
        MenuItem(itemName = "Brasileira", icon = R.drawable.menu_hamb),
        MenuItem(itemName = "Pizza", icon = R.drawable.menu_hamb),
        MenuItem(itemName = "Carnes", icon = R.drawable.menu_hamb),
        MenuItem(itemName = "Vegetariana", icon = R.drawable.menu_hamb),
        MenuItem(itemName = "Sorvete e açai", icon = R.drawable.menu_hamb),
        MenuItem(itemName = "Gourmet", icon = R.drawable.menu_hamb),
        MenuItem(itemName = "Marmita", icon = R.drawable.menu_hamb),
        MenuItem(itemName = "Outros", icon = R.drawable.menu_hamb),
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
            TopBarSearchScreens(title = "Buscar")
            Spacer(modifier = Modifier.height(14.dp))
            FindRestaurant()
            Spacer(modifier = Modifier.height(29.dp))
            LazyColumn( ) {
               items(menu) { menu ->
                   MenuItem(name = menu.itemName, icon = menu.icon)
               }
            }
        }

    }
}


@Composable
fun MenuItem(name: String, icon: Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(59.dp),
        elevation = 10.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(start = 16.dp)
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = "descrição do icone",
                modifier = Modifier
                    .height(35.dp)
                    .width(35.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = name,
                fontFamily = Actay,
                fontSize = 14.sp,
                fontWeight = FontWeight.W700,
                color = PrimaryPrincipalColor
            )
        }
    }
    Spacer(modifier = Modifier.height(16.dp))
}