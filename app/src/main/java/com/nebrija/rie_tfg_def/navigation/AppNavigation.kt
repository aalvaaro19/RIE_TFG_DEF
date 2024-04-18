package com.nebrija.rie_tfg_def.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nebrija.rie_tfg_def.screens.Login
import com.nebrija.rie_tfg_def.screens.Portada
import com.nebrija.rie_tfg_def.screens.PortadaConLogin
import com.nebrija.rie_tfg_def.screens.Registro

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun AppNavigation () {
    var navigationController = rememberNavController()
    NavHost(navController = navigationController, startDestination = AppScreens.PortadaConLogin.ruta){
        composable(AppScreens.Portada.ruta) { Portada(navigationController)}
        composable(AppScreens.Registro.ruta) { Registro(navigationController)}
        composable(AppScreens.Login.ruta) { Login(navigationController) }
        composable(AppScreens.PortadaConLogin.ruta){PortadaConLogin(navigationController)}
    }
}