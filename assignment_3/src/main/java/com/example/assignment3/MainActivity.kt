package com.example.assignment3

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Context.*
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.content.ContextCompat.startActivity
import com.example.assignment3.ui.theme.Assignment3Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            loginWebsite()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun loginWebsite() {
    var username by remember { mutableStateOf(" ") }
    var password by remember { mutableStateOf("") }
    val context = LocalContext.current

    Box (modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.b),
            contentDescription = "background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize())

        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {

            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "profile",
                modifier = Modifier.size(120.dp),
            )
            Text(text = "hello,tej", fontWeight = FontWeight.Bold
                , fontSize = 25.sp)

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(value = username,
                onValueChange = {username =it},
                label = {Text(text = "username")},
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(value = password,
                onValueChange = {password =it},
                label = { Text(text = "password")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Done
                )
                ,keyboardActions = KeyboardActions(
                    onDone = {

                    }
                ),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(20.dp))


            Row (horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
                ){
                Image(painter = painterResource(id = R.drawable.amazon),
                    contentDescription ="amazon",
                    modifier = Modifier.size(60.dp)
                )
                Spacer(modifier = Modifier.width(30.dp))


                Button(onClick = {

                    if (isInternetAvailable(context)) {
                        val url = "https://www.amazon.com"
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                        context.startActivity(intent)
                    } else {

                        Toast.makeText(context, "No internet connection", Toast.LENGTH_SHORT).show()
                    }
                },
                    modifier = Modifier) {
                    Text(text = "amazon")
                    
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            Row (horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(painter = painterResource(id = R.drawable.flipkart),
                    contentDescription ="amazon",
                    modifier = Modifier.size(90.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))


                Button(onClick = {

                    if (isInternetAvailable(context)) {
                        val url = "https://www.flipkart.com"
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                        context.startActivity(intent)
                    } else {

                        Toast.makeText(context, "No internet connection", Toast.LENGTH_SHORT).show()
                    }
                },
                    modifier = Modifier)
                {
                    Text(text = "flipkart")

                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            Row (horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(painter = painterResource(id = R.drawable.ajio),
                    contentDescription ="amazon",
                    modifier = Modifier.size(60.dp)
                )
                Spacer(modifier = Modifier.width(40.dp))


                Button(onClick = {

                    if (isInternetAvailable(context)) {
                        val url = "https://www.ajio.com"
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                        context.startActivity(intent)
                    } else {

                        Toast.makeText(context, "No internet connection", Toast.LENGTH_SHORT).show()
                    }
                },
                    modifier = Modifier) {
                    Text(text = "ajio")

                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            Row (horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(painter = painterResource(id = R.drawable.nike),
                    contentDescription ="amazon",
                    modifier = Modifier.size(60.dp)
                )
                Spacer(modifier = Modifier.width(40.dp))


                Button(onClick = {

                    if (isInternetAvailable(context)) {
                        val url = "https://www.nike.com"
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                        context.startActivity(intent)
                    } else {

                        Toast.makeText(context, "No internet connection", Toast.LENGTH_SHORT).show()
                    }
                },
                    modifier = Modifier) {
                    Text(text = "Nike")

                }
            }



        }

    }




}

fun isInternetAvailable(context: Context): Boolean {
    val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val networkInfo: NetworkInfo? = connectivityManager.activeNetworkInfo
    return networkInfo != null && networkInfo.isConnected
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    loginWebsite()

}