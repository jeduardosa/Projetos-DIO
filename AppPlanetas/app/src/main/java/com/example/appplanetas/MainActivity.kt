package com.example.appplanetas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appplanetas.models.Planetas
import com.example.appplanetas.ui.theme.AppPlanetasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppPlanetasTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                    val planetas = listOf<Planetas>(

                        Planetas(
                            "Mercurio",
                            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's" +
                                    " standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
                            R.drawable.mercurio
                        ),
                        Planetas(
                            "Venus",
                            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's" +
                                    " standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
                            R.drawable.venus
                        ),
                        Planetas(
                            "Terra",
                            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's" +
                                    " standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
                            R.drawable.terra
                        ),
                        Planetas(
                            "Marte",
                            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's" +
                                    " standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
                            R.drawable.marte
                        ),
                        Planetas(
                            "Jupter",
                            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's" +
                                    " standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
                            R.drawable.jupter
                        ),
                        Planetas(
                            "Saturno",
                            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's" +
                                    " standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
                            R.drawable.saturno
                        ),
                        Planetas(
                            "Urano",
                            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's" +
                                    " standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
                            R.drawable.urano
                        ),
                        Planetas(
                            "Netuno",
                            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's" +
                                    " standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
                            R.drawable.netuno
                        ),
                    )
                    Scaffold(topBar = {
                        TopAppBar(contentColor = Color.White,
                            backgroundColor = Color(0x770000ff),
                            title = { Text(text = "Aplicativo de planetas") })
                    }
                    ) {
                        Navegacao(planetas = planetas)
                    }

                }
            }
        }
    }
}

@Composable
fun Navegacao(planetas: List<Planetas>) {
    val navigation = rememberNavController()
    NavHost(navController = navigation, startDestination = "TelaInicial")
    {
        composable("TelaInicial") { Tela(navigation, planetas) }
    }
}

@Composable
fun Tela(NavController: NavController, planetas: List<Planetas>) {

}


























