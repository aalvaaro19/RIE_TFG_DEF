package com.nebrija.rie_tfg_def.navigation

open class AppScreens (val ruta: String){
    object Portada : AppScreens("Portada")
    object Registro : AppScreens("Registro")
    object Login : AppScreens("Login")
    object PortadaConLogin : AppScreens("PortadaConLogin")

}