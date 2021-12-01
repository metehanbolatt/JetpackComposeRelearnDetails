package com.metehanbolat.jetpackcomposedetailsrelearn

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.metehanbolat.jetpackcomposedetailsrelearn.ui.theme.JetpackComposeDetailsRelearnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeDetailsRelearnTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GreetingList()
    }
}

@SuppressLint("UnrememberedMutableState")
@Composable
fun GreetingList() {
    val greetingListState = remember { mutableStateListOf("John", "Amanda") }

    for (name in greetingListState){
        Greeting(name = name)
    }

    Button(
        onClick = { greetingListState.add("Michael") }
    ) {
        Text(text = "Add New Name")
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        style = MaterialTheme.typography.h4
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingListPreview() {
    MainScreen()
}
