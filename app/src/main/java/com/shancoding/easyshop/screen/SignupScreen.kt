package com.shancoding.easyshop.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun SignupScreen(modifier: Modifier = Modifier) {

    var email by remember() {
        mutableStateOf("")
    }

    var name by remember() {
        mutableStateOf("")
    }

    var password by remember() {
        mutableStateOf("")
    }

    Column (
        modifier = Modifier.fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Register,",
            style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold),
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            "For Using This App",
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            ),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(40.dp))
        OutlinedTextField(
            value = email,
            shape = RoundedCornerShape(18.dp),
            label = {
                Text("Email address")
            },
            onValueChange = {
                email = it
            },
            modifier = Modifier.fillMaxWidth(),
        )

        Spacer(Modifier.height(20.dp))

        OutlinedTextField(
            value = name,
            shape = RoundedCornerShape(18.dp),
            label = {
                Text("Full name")
            },
            onValueChange = {
                name = it
            },
            modifier = Modifier.fillMaxWidth(),
        )

        Spacer(Modifier.height(20.dp))

        OutlinedTextField(
            value = password,
            shape = RoundedCornerShape(18.dp),
            label = {
                Text("Password")
            },
            onValueChange = {
                password = it
            },
            modifier = Modifier.fillMaxWidth(),
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(Modifier.height(40.dp))

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
                .height(60.dp)
        ) {
            Text("Sign Up")
        }
    }
}