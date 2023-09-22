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
fun screen2(navController: NavController) {

    var searchQuery by remember { mutableStateOf("") }


    Image(
        painter = painterResource(id = R.drawable.screen2),
        contentDescription = "background", contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxSize()

    )
    Column{
        Spacer(modifier = Modifier.height(15.dp))

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

        Spacer(modifier = Modifier.height(10.dp))

        Card(modifier = Modifier
            .fillMaxWidth()
            .size(135.dp), onClick = { navController.navigate("screen3") }) {

            Row (modifier = Modifier, verticalAlignment = Alignment.CenterVertically){
                Image(painter = painterResource(id = R.drawable.dominos),
                    contentDescription = "dominos"
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column(modifier = Modifier,) {
                    Text(text = "Domino's Pizza", modifier = Modifier,
                        style = TextStyle(fontSize = 30.sp), fontWeight = FontWeight.ExtraBold
                    )
                    Row {
                        Image(painter = painterResource(id = R.drawable.star), contentDescription ="star",
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(text = "3.9 (130+)",style = TextStyle(fontSize = 16.sp), fontWeight = FontWeight.Bold)
                        
                    }
                    Text(text = "will deliver in 19 min")
                }

            }

        }
        Spacer(modifier = Modifier.height(15.dp))

        Card(modifier = Modifier
            .fillMaxWidth()
            .size(135.dp), onClick = { navController.navigate("screen6") }) {

            Row (modifier = Modifier, verticalAlignment = Alignment.CenterVertically){
                Image(painter = painterResource(id = R.drawable.kfc),
                    contentDescription = "K.F.C"
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column(modifier = Modifier,) {
                    Text(text = "K.F.C", modifier = Modifier,
                        style = TextStyle(fontSize = 30.sp), fontWeight = FontWeight.ExtraBold
                    )
                    Row {
                        Image(painter = painterResource(id = R.drawable.star), contentDescription ="star",
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(text = "4.2 (80+)",style = TextStyle(fontSize = 16.sp), fontWeight = FontWeight.Bold)

                    }
                    Text(text = "will deliver in 22 min")
                }

            }

        }
        Spacer(modifier = Modifier.height(15.dp))

        Card(modifier = Modifier
            .fillMaxWidth()
            .size(135.dp), onClick = { navController.navigate("screen9") }) {

            Row (modifier = Modifier, verticalAlignment = Alignment.CenterVertically){
                Image(painter = painterResource(id = R.drawable.lanarh),
                    contentDescription = "dominos"
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column(modifier = Modifier,) {
                    Text(text = "Lan arh", modifier = Modifier,
                        style = TextStyle(fontSize = 30.sp), fontWeight = FontWeight.ExtraBold
                    )
                    Row {
                        Image(painter = painterResource(id = R.drawable.star), contentDescription ="star",
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(text = "4.0 (100+)",style = TextStyle(fontSize = 16.sp), fontWeight = FontWeight.Bold)

                    }
                    Text(text = "will deliver in 28 min")
                }

            }

        }
        Spacer(modifier = Modifier.height(15.dp))

        Card(modifier = Modifier
            .fillMaxWidth()
            .size(135.dp), onClick = {navController.navigate("screen12")}) {

            Row (modifier = Modifier, verticalAlignment = Alignment.CenterVertically){
                Image(painter = painterResource(id = R.drawable.paradise),
                    contentDescription = "dominos",
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column(modifier = Modifier,) {
                    Text(text = "Paradise Biryani", modifier = Modifier,
                        style = TextStyle(fontSize = 30.sp), fontWeight = FontWeight.ExtraBold
                    )
                    Row {
                        Image(painter = painterResource(id = R.drawable.star), contentDescription ="star",
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(text = "3.7 (60+)",style = TextStyle(fontSize = 16.sp), fontWeight = FontWeight.Bold)

                    }
                    Text(text = "will deliver in 21 min")
                }

            }
            

            

        }
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = { navController.navigate("screen1") }) {
            Text(text = "<-LOG OUT")
        }
        

    }

}



