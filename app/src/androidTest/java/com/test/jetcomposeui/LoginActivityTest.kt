package com.test.jetcomposeui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.test.jetcomposeui.screens.login.SignInPage
import org.junit.Rule
import org.junit.Test


class LoginActivityTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun signInPage_isDisplayed() {
        // Launch the SignInPage
        composeTestRule.setContent {
            SignInPage(Modifier.fillMaxSize())
        }

        // Assert that the SignInPage is displayed
      composeTestRule.onNodeWithText("Sign In").assertIsDisplayed()
      composeTestRule.onNodeWithText("Sign In").performClick()

    }
}
