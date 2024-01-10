package com.test.jetcomposeui.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
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
fun MyTextComponent(title: String, textStyle: TextStyle = TextStyle.Default) {

    Text(
        title,
        style = textStyle,
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 50.dp),
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