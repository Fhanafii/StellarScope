package com.fhanafi.stellarscope

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.fhanafi.stellarscope.ui.screen.welcome.WelcomeScreen
import com.fhanafi.stellarscope.ui.theme.StellarScopeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StellarScopeTheme {
                WelcomeScreen()
            }
        }
    }
}