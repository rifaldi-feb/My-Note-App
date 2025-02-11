package com.example.mynote.ui.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun AddNote(
    navController : NavController,
){
    var title by remember {
        mutableStateOf("")
    }
    var desc by remember {
        mutableStateOf("")
    }
    Box(
       modifier = Modifier
           .statusBarsPadding()
           .navigationBarsPadding()
    ){
        Column {
            Spacer(modifier = Modifier.size(16.dp))
            TextField(
                modifier = Modifier,
                value = title,
                onValueChange = {
                    title = it
                }
            )
            Spacer(modifier = Modifier.size(30.dp))
            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = desc,
                onValueChange = {
                    desc = it
                }
            )
        }

    }

}