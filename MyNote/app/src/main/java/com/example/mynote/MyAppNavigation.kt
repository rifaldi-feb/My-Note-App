package com.example.mynote

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mynote.model.value
import com.example.mynote.ui.presentation.AddNote
import com.example.mynote.ui.presentation.NoteList

@Composable
fun MyAppNavigation(modifier : Modifier){
    val navController = rememberNavController()

    NavHost(navController = navController , startDestination =  "home"){
        composable("home"){ NoteList(value, modifier = Modifier,navController) }
        composable("add"){ AddNote(navController) }
    }
}