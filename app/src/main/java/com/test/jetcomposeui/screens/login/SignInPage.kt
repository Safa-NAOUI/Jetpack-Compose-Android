package com.test.jetcomposeui.screens.login

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.test.jetcomposeui.ui.component.ColumnComponent
import com.test.jetcomposeui.ui.theme.JetComposeUITheme

/**
 * Created by Safa NAOUI on 24/12/2023.
 */
@Composable
fun SignInPage() {

    Surface(color = MaterialTheme.colorScheme.background) {
        ColumnComponent()
        {
            SignInScreen()
        }
    }
}


@Preview()
@Composable
fun DefaultPreviewSignInPage() {
    JetComposeUITheme {
        SignInPage()
    }
}