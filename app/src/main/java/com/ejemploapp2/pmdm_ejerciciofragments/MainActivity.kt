package com.ejemploapp2.pmdm_ejerciciofragments

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

    //Navigation se divide en una UI con diferentes fragments tanto en layout como en clases, que al seleccionar
    // en el botón nos mostrará dicho fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Creamos la barra de navegación de abajo indicandole los siguientes parámetros
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)

        // Indicamos el tamaño de la barra de navegación
        // para añadir otro botón necesitariamos añadir todos los parámetros necesarios en
        // la carpeta res en los apartados values/strings, navigation/mobile_navigation y menu/bottom_nav_menu
        // además de crear la carpeta en la ui de nuevo fragmento con sus clases.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.navigation_errors
            )
        )
        //Se crea y se muestra
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}
