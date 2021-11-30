package com.metehanbolat.jetpackcomposedetailsrelearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            /** SpaceAround Composable'lar arasına koyduğu boşluğun yarısı kadar start/end margin verir.*/
            /** SpaceEvenly Composable'lar arasına koyduğu boşluk kadar start-end margin verir..*/
            /** SpaceBetween Start/End parent olarak uygulayıp aralardaki composable'lara eşit boşluk verir. */
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                ColoredSquare(Color.Magenta)
                ColoredSquare(Color.Red)
            }
            ColoredSquare(Color.Green)
            ColoredSquare(Color.Cyan)
            ColoredSquare(Color.White)
        }
    }
}

@Composable
fun ColoredSquare(color: Color) {
    Surface(
        color = color,
        modifier = Modifier
            .size(100.dp)
    ){ }
}

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen()
}
