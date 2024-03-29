package com.test.jetcomposeui.screens.login

import android.annotation.SuppressLint
import androidx.compose.material3.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.test.jetcomposeui.ui.component.ColumnComponent
import com.test.jetcomposeui.ui.theme.JetComposeUITheme

/**
 * Created by Safa NAOUI on 24/12/2023.
 */
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SignInPage(navController: NavController) {
    Scaffold {

        Surface(color = MaterialTheme.colorScheme.background) {
            ColumnComponent()
            {
                SignInScreen(navController)
            }
        }
    }
}

@Preview()
@Composable
fun DefaultPreviewSignInPage() {
    val navController = rememberNavController()
    JetComposeUITheme {
        SignInPage(navController)
    }
}