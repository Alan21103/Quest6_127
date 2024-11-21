package com.example.quest6_127.ui.view.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun MahasiswaFormView(
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit
) {
    var nama by remember {
        mutableStateOf("")
    }
    var nim by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
}