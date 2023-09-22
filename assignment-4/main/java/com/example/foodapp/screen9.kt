package com.example.foodapp


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.runtime.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun screen9(navController: NavController) {

    var searchQuery by remember { mutableStateOf("") }
    Image(
        painter = painterResource(id = R.drawable.screen2),
        contentDescription = "background", contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxSize()

    )
    Column{

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = searchQuery,
            onValueChange = { newValue ->
                searchQuery = newValue
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            placeholder = { Text(text = "Search...") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = {
                }
            )
        )

        Spacer(modifier = Modifier.height(16.dp))


        Card(modifier = Modifier
            .fillMaxWidth()
            .size(135.dp), onClick = { navController.navigate("screen10") }) {

            Row (modifier = Modifier, verticalAlignment = Alignment.CenterVertically){
                Image(painter = painterResource(id = R.drawable.noodles),
                    contentDescription = "Noodles"
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column(modifier = Modifier,) {
                    Text(text = "Noodles", modifier = Modifier,
                        style = TextStyle(fontSize = 30.sp), fontWeight = FontWeight.ExtraBold
                    )

                    Text(text = "  classic comfort food loved for their endless topping possibilities.")


                }

            }

        }
        Spacer(modifier = Modifier.height(30.dp))

        Card(modifier = Modifier
            .fillMaxWidth()
            .size(135.dp), onClick = {navController.navigate("screen11")}) {

            Row (modifier = Modifier, verticalAlignment = Alignment.CenterVertically){
                Image(painter = painterResource(id = R.drawable.friedrice),
                    contentDescription = "Fried rice"
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column(modifier = Modifier,) {
                    Text(text = "fried chicken", modifier = Modifier,
                        style = TextStyle(fontSize = 30.sp), fontWeight = FontWeight.ExtraBold
                    )

                    Text(text = "SCrispy, golden-brown fried chicken with a flavorful and tender interior")
                }

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigate("screen2") }) {
            Text(text = "<-BACK")

        }



    }

}
