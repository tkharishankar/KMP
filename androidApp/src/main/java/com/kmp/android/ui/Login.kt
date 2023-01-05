@file:OptIn(ExperimentalMaterial3Api::class)

package com.kmp.android.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

/**
 * Author: Hari K
 * Date: 05/01/2023.
 */

@Composable
fun LoginScreen() {

    var username by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        TextField(
            modifier = Modifier.padding(8.dp).fillMaxWidth(),
            value = username,
            onValueChange = {
                username = it
            },
            label = {
                Text("Username")
            },
            placeholder = {
                Text(text = "Enter username")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        TextField(
            modifier = Modifier.padding(8.dp).fillMaxWidth(),
            value = password,
            onValueChange = {
                password = it
            },
            label = {
                Text("Password")
            },
            placeholder = {
                Text(text = "Enter password")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Button(
            modifier = Modifier.padding(8.dp)
                .fillMaxWidth(),
            onClick = { }) {
            Text("Login")
        }
    }
}