package com.nebrija.rie_tfg_def.screens

import android.annotation.SuppressLint
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.nebrija.rie_tfg_def.R
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.Locale

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PortadaConLogin(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp),
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.White,
                    titleContentColor = Color.Black,
                ),
                title = {
                    Icon(
                        painter = painterResource(R.drawable.logorienegro),
                        contentDescription = "Home",
                        tint = Color.Black,
                        modifier = Modifier.size(105.dp)
                    )
                },
                navigationIcon = {
                    androidx.compose.material3.IconButton(onClick = { navController.navigate("portadaAplicacion") }) {
                        Icon(
                            painterResource(R.drawable.menudesplegable_removebg_preview),
                            contentDescription = "Dropdown menu",
                            tint = Color.Black,
                        )
                    }
                },
            )
        },
        bottomBar = {
            BottomAppBar(
                content = {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        // Espaciado inicial
                        Spacer(modifier = Modifier.weight(1f))

                        // Icono Home
                        BottomNavigationItem(
                            selected = false,
                            onClick = {navController.navigate("portadaAplicacion")},
                            modifier = Modifier.weight(1f),
                            icon = {
                                Icon(imageVector = Icons.Default.Home, contentDescription = "Home", tint = Color.White)

                            },
                        )

                        // Espaciado entre iconos
                        Spacer(modifier = Modifier.weight(2.5f))

                        // Icono Search
                        BottomNavigationItem(
                            selected = false,
                            onClick = {},
                            modifier = Modifier.weight(1f),
                            icon = {
                                Icon(imageVector = Icons.Default.DateRange, contentDescription = "Search", tint = Color.White)
                            },
                        )

                        // Espaciado entre iconos
                        Spacer(modifier = Modifier.weight(2.5f))

                        // Icono Notifications
                        BottomNavigationItem(
                            selected = false,
                            onClick = {},
                            modifier = Modifier.weight(1f),
                            icon = {
                                Icon(imageVector = Icons.Default.Notifications, contentDescription = "Notifications", tint = Color.White)
                            },
                        )

                        // Espaciado entre iconos
                        Spacer(modifier = Modifier.weight(2.5f))

                        // Icono Person
                        BottomNavigationItem(
                            selected = false,
                            onClick = {},
                            modifier = Modifier.weight(0.7f),
                            icon = {
                                Icon(imageVector = Icons.Default.Notifications, contentDescription = "Notifications", tint = Color.White)
                            },
                        )

                        // Espaciado final
                        Spacer(modifier = Modifier.weight(1f))
                    }
                },
                backgroundColor = Color(56, 181, 254, 255)
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
        ) {
            Spacer(modifier = Modifier.size(10.dp))
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {

            }
        }
    }
}