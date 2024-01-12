package com.test.jetcomposeui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.test.jetcomposeui.screens.login.SignInPage
import com.test.jetcomposeui.screens.signup.SignUpPage
import com.test.jetcomposeui.ui.theme.JetComposeUITheme
import com.test.jetcomposeui.utils.AppStrings

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetComposeUITheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "SignInPage"
                ) {
                    composable(AppStrings.screenSignInPage) { SignInPage(navController) }
                    composable(AppStrings.screenSignUpPage) { SignUpPage(navController) }
                }
            }
        }
    }
}