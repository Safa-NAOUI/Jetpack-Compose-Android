package com.test.jetcomposeui.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.test.jetcomposeui.ui.styles.TextCustomStyle
import com.test.jetcomposeui.ui.theme.JetComposeUITheme

/**
 * Created by Safa NAOUI on 24/12/2023.
 */
@Composable
fun MyTextComponent(title: String, textStyle: TextStyle = TextStyle.Default,
                    onClick: (() -> Unit)? = null) {

    Text(
        title,
        style = textStyle,
        modifier = Modifier
             .padding(end = 16.dp)
            .padding(bottom = 50.dp)
            .clickable { onClick?.invoke()  },
    )
}

@Preview()
@Composable
fun PreviewTextTitle() {
    JetComposeUITheme {

        MyTextComponent(
            "Title test",
            TextCustomStyle.textWhiteCustomStyle(true),
        )
    }
}