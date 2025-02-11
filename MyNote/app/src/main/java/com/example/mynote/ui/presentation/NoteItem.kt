package com.example.mynote.ui.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mynote.ui.theme.MyNoteTheme
import kotlin.random.Random

@Composable
fun NoteItem(title : String , description : String, navController : NavController){

    val randomColor = Color(
        red = Random.nextFloat(),
        green = Random.nextFloat(),
        blue = Random.nextFloat(),
        alpha = 1f
    )
    Box(
        modifier = Modifier
            .padding(8.dp)
            .background(color = randomColor)
            .fillMaxWidth()
            .clickable{
                navController.navigate("add")
            },

    ){
        Column (
            modifier = Modifier
                .padding(16.dp)

        ) {
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground

            )
            Text(
                text = description,
                color = MaterialTheme.colorScheme.onBackground
            )
        }
    }
}

//@Composable
//@PreviewLightDark
//fun NoteItemPreview(){
//    MyNoteTheme {
//        NoteItem("mau makan bareng", "makan bareng client jam 10 pagi")
//    }
//}