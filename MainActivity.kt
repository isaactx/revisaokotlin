package com.example.ativmobilebasico

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ativmobilebasico.ui.theme.ativmobilebasicoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tela()
        }
    }
}

@Composable
fun Tela() {
    ativmobilebasicoTheme {
        // A surface container using the 'background' color from the theme
        Surface(
                modifier = Modifier.width(200.dp).height(500.dp),
                elevation = 4.dp,
                shape = RoundedCornerShape(8.dp),
                color = Color.Red
        ) {
            Column(

            ) {
                Text(
                        "Palmeiras Não Tem Mundial",
                        fontSize = 24.sp,
                        color = Color.White,

                        modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                )
            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    Tela()


}