package com.nebrija.rie_tfg_def

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nebrija.rie_tfg_def.navigation.AppNavigation
import com.nebrija.rie_tfg_def.ui.theme.RIE_TFG_DEFTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RIE_TFG_DEFTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    AppNavigation()
                }
            }
        }
    }
}