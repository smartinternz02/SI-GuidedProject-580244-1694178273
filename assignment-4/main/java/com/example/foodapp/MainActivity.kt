package com.example.foodapp

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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.foodapp.ui.theme.FoodappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MyApp()

        }
    }
}

@Composable
fun MyApp() {

    val navController = rememberNavController()
    
    

    NavHost(navController = navController, startDestination ="screen1" ){

        composable("screen1"){ screen1(navController) }
        composable("screen2"){ screen2(navController) }
        composable("screen3"){ screen3(navController) }
        composable("screen4"){ screen4(navController) }
        composable("screen5"){ screen5(navController) }
        composable("screen6"){ screen6(navController) }
        composable("screen7"){ screen7(navController) }
        composable("screen8"){ screen8(navController) }
        composable("screen9"){ screen9(navController) }
        composable("screen10"){ screen10(navController) }
        composable("screen11"){ screen11(navController) }
        composable("screen12"){ screen12(navController) }
        composable("screen13"){ screen13(navController) }
        composable("screen14"){ screen14(navController) }

















    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
        MyApp()


}