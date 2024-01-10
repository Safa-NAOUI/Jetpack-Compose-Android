package com.test.jetcomposeui.ui.styles

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import com.test.jetcomposeui.ui.theme.Blue

/**
 * Created by Safa NAOUI on 25/12/2023.
 */

class TextCustomStyle {
    companion object {

        @Composable
        fun textTitleCustomStyle(): TextStyle {
            return TextStyle(
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
            )
        }

        @Composable
        fun textCustomStyle(): TextStyle {
            return TextStyle(
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Blue,
                textAlign = TextAlign.Center,
            )
        }

        @Composable
        fun textWhiteCustomStyle( underline: Boolean?): TextStyle {

            val textDecorationUnderline = remember {
                if (underline == true) TextDecoration.Underline
                else TextDecoration.None
            }

            return TextStyle(
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                textDecoration = textDecorationUnderline
            )
        }
    }
}
