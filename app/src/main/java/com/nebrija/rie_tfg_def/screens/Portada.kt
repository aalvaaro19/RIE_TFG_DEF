package com.nebrija.rie_tfg_def.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.nebrija.rie_tfg_def.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Portada(navController: NavController) {
    val image = painterResource(R.drawable.logo_rie)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .size(500.dp, 250.dp)
        )
        Button(onClick = { navController.navigate("Login") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp,20.dp,20.dp),
            colors = ButtonDefaults.buttonColors(Color(0, 190, 98, 255))
        ) {
            Text("Iniciar sesion", fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.size(10.dp))
        Button(onClick = { navController.navigate("Registro") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp,20.dp,20.dp),
            colors = ButtonDefaults.buttonColors(Color(250, 117, 76, 255))
        ) {
            Text("Registrarse", fontSize = 20.sp)
        }
    }
}