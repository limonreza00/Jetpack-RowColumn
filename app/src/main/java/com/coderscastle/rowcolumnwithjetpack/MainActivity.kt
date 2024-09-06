package com.coderscastle.rowcolumnwithjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            RowColumnMain()
        }
    }
}


@Composable
fun RowColumnMain() {

    Column (modifier = Modifier.background(color = Color.Yellow).fillMaxSize()){

        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(horizontal = 10.dp,vertical = 10.dp).fillMaxWidth().background(color = Color.Gray)

        ){

            Image(painter = painterResource(R.drawable.linkedin_blue), contentDescription = "My image 1", modifier = Modifier.size(100.dp,100.dp).padding(10.dp))
            Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = "My image 2", modifier = Modifier.size(100.dp,100.dp).padding(10.dp))
            Image(painter = painterResource(R.drawable.x_logo), contentDescription = "My image 3", modifier = Modifier.size(100.dp,100.dp).padding(10.dp))

        }

        Column (
            verticalArrangement =Arrangement.Center,
            modifier = Modifier.padding(horizontal = 10.dp,vertical = 20.dp).background(color=Color.Gray).size(100.dp,400.dp)
        ){

            Image(painter = painterResource(R.drawable.bd_flood), contentDescription = "My image 4", modifier = Modifier.size(100.dp,100.dp).padding(10.dp))
            Image(painter = painterResource(R.drawable.muzan), contentDescription = "My image 5", modifier = Modifier.size(100.dp,100.dp).padding(10.dp))
            Image(painter = painterResource(R.drawable.coders_castle_banner), contentDescription = "My image 6", modifier = Modifier.size(100.dp,100.dp).padding(10.dp))

        }

        Box (
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 0.dp).background(color = Color.Gray).fillMaxWidth(),
            contentAlignment = Alignment.Center){

                Image(painter = painterResource(R.drawable.youtube_logo), contentDescription = "My image 7", modifier = Modifier.size(100.dp,100.dp).padding(10.dp))

        }

    }

}


@Preview(showBackground = true,showSystemUi = true)
@Composable
fun RowColumnMainPreview() {
RowColumnMain()
}