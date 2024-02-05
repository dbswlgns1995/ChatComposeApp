package com.example.presentation.ui.components.textfield

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.presentation.R
import com.example.presentation.ui.theme.ChatComposeAppTheme
import com.example.presentation.ui.theme.Paddings
import java.util.regex.Pattern

private val passwordPattern: (String) -> Boolean = { password ->
    Pattern.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,20}$", password)
}

@Composable
fun TextFieldScreen(
    modifier: Modifier = Modifier,
    isPassword: Boolean = false,
    textOutput: (String) -> Unit,
) {
    var text by remember {
        mutableStateOf("")
    }

    var isError by remember {
        mutableStateOf(false)
    }

    Column {
        OutlinedTextField(
            value = text,
            label = {
                Text(
                    text = if (isPassword) stringResource(R.string.text_field_screen_password) else stringResource(
                        R.string.text_field_screen_email
                    )
                )
            },
            onValueChange = {
                text = it
                isError = !checkError(isPassword, text)
                if (!isError) textOutput(text)
            },
            isError = isError,
            maxLines = 1,
            keyboardOptions =
            if (isPassword)
                KeyboardOptions(keyboardType = KeyboardType.Password)
            else
                KeyboardOptions(keyboardType = KeyboardType.Email),
            placeholder = {
                if (isPassword) Text(stringResource(R.string.text_field_screen_input_password)) else Text(
                    stringResource((R.string.text_field_screen_input_email))
                )
            },
            modifier = modifier
                .fillMaxWidth()
                .padding(Paddings.medium),
            shape = MaterialTheme.shapes.large,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = MaterialTheme.colors.onPrimary,
                backgroundColor = MaterialTheme.colors.background
            )
        )

        if(isError) {
            Text(
                text = if(isPassword) stringResource(id = R.string.text_field_screen_password_error) else stringResource(id = R.string.text_field_screen_email_error),
                color = MaterialTheme.colors.error,
                modifier = Modifier.padding(start = 16.dp),
            )
        }

    }
}

private fun checkError(isPassword: Boolean, text: String): Boolean {
    return if (isPassword) {
        passwordPattern(text)
    } else {
        android.util.Patterns.EMAIL_ADDRESS.matcher(text).matches()
    }
}

@Preview
@Composable
fun TextFieldScreenPreview() {
    ChatComposeAppTheme {
        TextFieldScreen(
            isPassword = false
        ) {

        }
    }
}