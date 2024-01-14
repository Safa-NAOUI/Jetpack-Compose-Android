package com.test.jetcomposeui.screens.signup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.test.jetcomposeui.R
import com.test.jetcomposeui.ui.component.ButtonComponent
import com.test.jetcomposeui.ui.component.ColumnComponent
import com.test.jetcomposeui.ui.component.MyTextComponent
import com.test.jetcomposeui.ui.component.MyTextFieldComponent
import com.test.jetcomposeui.ui.styles.TextCustomStyle
import com.test.jetcomposeui.ui.theme.JetComposeUITheme
import com.test.jetcomposeui.ui.theme.Blue
import com.test.jetcomposeui.utils.AppStrings

/**
 * Created by Safa NAOUI on 24/12/2023.
 */
@Composable
fun SignUpScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {

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
            stringResource(R.string.sign_up),
            textStyle = TextCustomStyle.textTitleCustomStyle()
        )

        ColumnComponent(
            modifier = modifier
                .fillMaxHeight()
                .padding(top = 25.dp, bottom = 25.dp, start = 10.dp, end = 10.dp)
        ) {

            /** Username TextField   **/
            MyTextFieldComponent(
                stringResource(R.string.username),
                Icons.Default.Person,
                textStyle = TextCustomStyle.textCustomStyle()
            )

            /** Email TextField   **/
            MyTextFieldComponent(
                stringResource(R.string.enter_your_mail),
                Icons.Default.Mail,
                textStyle = TextCustomStyle.textCustomStyle()
            )

            /** Password TextField  **/
            MyTextFieldComponent(
                stringResource(R.string.enter_your_password),
                Icons.Default.Lock,
                textStyle = TextCustomStyle.textCustomStyle(),
                true
            )

            /** Sign-Up Button  **/
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                MyTextComponent(
                    stringResource(R.string.sign_up_have_account_message),

                    textStyle = TextCustomStyle.textWhiteCustomStyle(false)
                )
                MyTextComponent(
                    stringResource(R.string.sign_in),
                    textStyle = TextCustomStyle.textWhiteCustomStyle(true),
                    onClick = {
                        navController.navigate(AppStrings.screenSignInPage)
                    },
                )
            }

            /** Sign-In Button  **/
            ButtonComponent(
                stringResource(R.string.sign_up),
                textStyle = TextCustomStyle.textCustomStyle(),
                onClick = {

                },
            )

        }
    }

}

@Preview()
@Composable
fun DefaultPreviewSignInScreen() {
    val navController = rememberNavController()
    JetComposeUITheme {
        SignUpScreen(navController)
    }
}