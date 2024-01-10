package com.test.jetcomposeui.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.test.jetcomposeui.ui.theme.Blue
import com.test.jetcomposeui.ui.theme.JetComposeUITheme

/**
 * Created by Safa NAOUI on 24/12/2023.
 */
@Composable
fun MyTextFieldComponent(
    placeholder: String,
    icon: ImageVector?,
    textStyle: TextStyle = TextStyle.Default,
    isPassword: Boolean? = false
) {
    var text by remember { mutableStateOf("") }

    val keyboardController = LocalSoftwareKeyboardController.current
    val keyboardOptions = remember {
        KeyboardOptions(
            imeAction = androidx.compose.ui.text.input.ImeAction.Done,
            keyboardType = if (isPassword == true) KeyboardType.Password
            else KeyboardType.Text
        )
    }
    val visualTransformation = remember {
        if (isPassword == true) PasswordVisualTransformation()
        else VisualTransformation.None
    }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = {
            Text(
                placeholder, style = textStyle
            )
        },
        keyboardOptions = keyboardOptions,
        keyboardActions = KeyboardActions(onDone = {
            // Handle the 'Done' action here
            keyboardController?.hide()
        }),
        visualTransformation = visualTransformation,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        leadingIcon = {
            if (icon != null) {
                Icon(
                    imageVector = icon, contentDescription = null
                )
            }
        },

        )
}

@Preview()
@Composable
fun PreviewTextField() {
    JetComposeUITheme {
        MyTextFieldComponent(
            "test", Icons.Default.Person, textStyle = TextStyle(
                fontWeight = FontWeight.Bold, fontSize = 14.sp, color = Blue
            )
        )
    }
}
