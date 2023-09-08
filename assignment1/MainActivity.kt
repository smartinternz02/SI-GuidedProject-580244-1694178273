package com.example.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.text.input.TextFieldValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Spacer(modifier = Modifier.padding(vertical = 40.dp))
                hello()
                userid()
                Spacer(modifier = Modifier.padding(vertical = 30.dp))
                button()

            }
        }
    }
}

@Composable
fun hello() {
    Text(text = "ENTER YOUR DETAILS", modifier = Modifier.padding(16.dp))
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun userid(){
    var text by remember { mutableStateOf(" ") }
    TextField(value = text, onValueChange = {it ->text=it}, label = { Text(text = "USER ID!")})
    Spacer(modifier = Modifier.padding(vertical = 20.dp))
    var tex by remember { mutableStateOf(" ") }
    TextField(value = tex, onValueChange = {it ->tex=it}, label = { Text(text = "PASSWORD")})
}





@Composable
fun button(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "submit" ,modifier = Modifier.padding(10.dp))
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.padding(vertical = 40.dp))
        hello()
        userid()
        Spacer(modifier = Modifier.padding(vertical = 30.dp))
        button()


    }

}