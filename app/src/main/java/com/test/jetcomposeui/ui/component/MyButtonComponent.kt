package com.test.jetcomposeui.ui.component

import android.util.Log
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.test.jetcomposeui.R
import com.test.jetcomposeui.ui.theme.JetComposeUITheme
import com.test.jetcomposeui.ui.styles.ButtonStyle

/**
 * Created by Safa NAOUI on 24/12/2023.
 */
@Composable
fun ButtonComponent(
    title: String, textStyle: TextStyle = TextStyle.Default,
    onClick: () -> Unit
) {

    Button(
        onClick = onClick,
        modifier = ButtonStyle.defaultButtonModifier(),
        colors = ButtonStyle.BlueButtonColors(),
        shape = RoundedCornerShape(6.dp),
    ) {
        Text(
            text = title,
            style = textStyle
        )
    }
}


@Preview()
@Composable
fun DefaultPreview1() {
    JetComposeUITheme {
        ButtonComponent(stringResource(R.string.sign_in))
        {

            /****** Handle onClick action ***/
            Log.d("LoginActivity", " onclick button ")
        }
    }
}