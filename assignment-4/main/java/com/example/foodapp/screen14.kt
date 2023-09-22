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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun screen14(navController: NavController) {

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
            .size(135.dp) ) {

            Row (modifier = Modifier, verticalAlignment = Alignment.CenterVertically){
                Image(painter = painterResource(id = R.drawable.chicken65),
                    contentDescription = "veg fried rice"
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column(modifier = Modifier,) {
                    Text(text = "Chicken 65", modifier = Modifier,
                        style = TextStyle(fontSize = 20.sp), fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.width(16.dp))

                    Text(text = "$ 10.99", modifier = Modifier,
                        style = TextStyle(fontSize = 16.sp), fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.width(10.dp))

                    Row {
                        Image(painter = painterResource(id = R.drawable.star), contentDescription ="star",
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(text = "4.0 (130+)",style = TextStyle(fontSize = 16.sp))
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(text = "ADD TO CART")
                        Image(painter = painterResource(id = R.drawable.cart), contentDescription = "cart", modifier = Modifier.size(21.dp))
                    }
                }

            }

        }
        Spacer(modifier = Modifier.height(20.dp))

        Card(modifier = Modifier
            .fillMaxWidth()
            .size(135.dp) ) {

            Row (modifier = Modifier, verticalAlignment = Alignment.CenterVertically){
                Image(painter = painterResource(id = R.drawable.staters),
                    contentDescription = "dominos"
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column(modifier = Modifier,) {
                    Text(text = "chilli chicken", modifier = Modifier,
                        style = TextStyle(fontSize = 20.sp), fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.width(16.dp))

                    Text(text = "$ 12.99", modifier = Modifier,
                        style = TextStyle(fontSize = 16.sp), fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.width(10.dp))

                    Row {
                        Image(painter = painterResource(id = R.drawable.star), contentDescription ="star",
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(text = "4.2 (80+)",style = TextStyle(fontSize = 16.sp))
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(text = "ADD TO CART")
                        Image(painter = painterResource(id = R.drawable.cart), contentDescription = "cart", modifier = Modifier.size(21.dp))
                    }
                }

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier
            .fillMaxWidth()
            .size(135.dp) ) {

            Row (modifier = Modifier, verticalAlignment = Alignment.CenterVertically){
                Image(painter = painterResource(id = R.drawable.tandoo),
                    contentDescription = "dominos"
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column(modifier = Modifier,) {
                    Text(text = "Chicken Tandoori", modifier = Modifier,
                        style = TextStyle(fontSize = 20.sp), fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.width(16.dp))

                    Text(text = "$ 15.99", modifier = Modifier,
                        style = TextStyle(fontSize = 16.sp), fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.width(10.dp))

                    Row {
                        Image(painter = painterResource(id = R.drawable.star), contentDescription ="star",
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(text = "4.5 (150+)",style = TextStyle(fontSize = 16.sp))
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(text = "ADD TO CART")
                        Image(painter = painterResource(id = R.drawable.cart), contentDescription = "cart", modifier = Modifier.size(21.dp))
                    }
                }

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigate("screen12") }) {
            Text(text = "<-BACK")
        }



    }

}

