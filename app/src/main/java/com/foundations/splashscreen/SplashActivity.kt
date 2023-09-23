package com.foundations.splashscreen

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.foundations.splashscreen.ui.theme.SplashScreenTheme
import kotlinx.coroutines.delay

@SuppressLint( "CustomSplashScreen")
class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreenTheme  {
                SplashScreen()
            }
        }
    }

    @Composable
    @Preview
    private fun SplashScreen(){
        LaunchedEffect(key1 = true){
            delay(30000)
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        }
        Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center ){
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = "DragonFlyTrekkers Logo")
        }
    }
}
