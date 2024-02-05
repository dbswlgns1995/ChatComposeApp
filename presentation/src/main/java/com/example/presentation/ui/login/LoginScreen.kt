package com.example.presentation.ui.login

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.presentation.ui.components.textfield.TextFieldScreen
import com.example.presentation.ui.theme.Paddings
import com.example.presentation.viewmodel.login.LoginViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun LoginScreen() {
    val scaffoldState = rememberScaffoldState()
    val viewModel = hiltViewModel<LoginViewModel>()

    LaunchedEffect(Unit) {
        // 로그인 중일 때 home으로 이동
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(Paddings.small)
    ) {
        TextFieldScreen(
            isPassword = false
        ) {

        }

        TextFieldScreen(
            isPassword = true
        ) {

        }


        Button(onClick = {  }) {
            Text("로그인")
        }

        Button(onClick = {  }) {
            Text("회원가입")
        }

    }
}