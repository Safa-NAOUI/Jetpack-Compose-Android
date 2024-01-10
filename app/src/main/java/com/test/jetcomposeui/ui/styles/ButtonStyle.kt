package com.test.jetcomposeui.ui.styles

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.test.jetcomposeui.ui.theme.Blue
import com.test.jetcomposeui.ui.theme.White

/**
 * Created by Safa NAOUI on 25/12/2023.
 */

class ButtonStyle {
    companion object {
        fun defaultButtonModifier(): Modifier {
            return Modifier
                .fillMaxWidth()
                .height(75.dp)
                .padding(16.dp)
        }

        @Composable
        fun BlueButtonColors(): ButtonColors {
            return ButtonDefaults.buttonColors(
                containerColor = White,
                contentColor = Blue,
            )
        }
    }
}
