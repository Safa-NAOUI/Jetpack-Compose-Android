package com.test.jetcomposeui.screens.login

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.test.jetcomposeui.R
import com.test.jetcomposeui.ui.component.ButtonComponent
import com.test.jetcomposeui.ui.component.ColumnComponent
import com.test.jetcomposeui.ui.component.MyTextComponent
import com.test.jetcomposeui.ui.component.MyTextFieldComponent
import com.test.jetcomposeui.ui.styles.TextCustomStyle
import com.test.jetcomposeui.ui.theme.JetComposeUITheme
import com.test.jetcomposeui.ui.theme.Blue

/**
 * Created by Safa NAOUI on 24/12/2023.
 */
@Composable
fun SignInScreen(
    modifier: Modifier = Modifier
) {
    var isKeyboardVisible by remember { mutableStateOf(false) }
    val keyboardController = LocalSoftwareKeyboardController.current


    ColumnComponent(
        modifier = modifier
            .fillMaxHeight()
            .background(Blue)
            .padding(top = 50.dp, bottom = 50.dp, start = 10.dp, end = 10.dp)
            .verticalScroll(rememberScrollState()),
    ) {

        /** Title  **/
        /** Title  **/
        MyTextComponent(
            stringResource(R.string.login),
            textStyle = TextCustomStyle.textTitleCustomStyle()
        )

        ColumnComponent(
            modifier = modifier
                .fillMaxHeight()
                .padding(top = 25.dp, bottom = 25.dp, start = 10.dp, end = 10.dp)
        ) {

            /** Email TextField   **/
            MyTextFieldComponent(
                stringResource(R.string.enter_your_mail),
                Icons.Default.Person,
                textStyle = TextCustomStyle.textCustomStyle()
            )

            /** Password TextField  **/
            MyTextFieldComponent(
                stringResource(R.string.enter_your_password),
                Icons.Default.Lock,
                textStyle = TextCustomStyle.textCustomStyle(),
                true
            )

            /** Password Forgot Text   **/
            MyTextComponent(
                stringResource(R.string.forgot_password),
                textStyle = TextCustomStyle.textWhiteCustomStyle(true)
            )

            /** Sign-In Button  **/
            ButtonComponent(
                stringResource(R.string.sign_in),
                textStyle = TextCustomStyle.textCustomStyle(),
                onClick = {
                    // Handle onClick action
                    keyboardController?.hide()
                    isKeyboardVisible = false

                     Log.d("SignIn Screen","Sign In button has been clicked")
                },
            )
        }
    }

}

@Preview()
@Composable
fun DefaultPreviewSignInScreen() {
    JetComposeUITheme {
        SignInScreen()
    }
}