package com.example.mynote.ui.presentation
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mynote.model.Note
import com.example.mynote.model.value
import com.example.mynote.ui.theme.MyNoteTheme


@Composable
fun NoteList(notes : List<Note>,modifier: Modifier = Modifier, navController : NavController){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp, bottom = 20.dp, start = 16.dp, end = 16.dp)

    ){
        LazyColumn (
            modifier = Modifier.fillMaxSize()
        ){
            items(notes){ note->
                NoteItem(note.title,note.description, navController)
            }
        }
        FloatingActionButton(
            onClick = {
                navController.navigate("add")
            },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(20.dp)

        ) {
            Icon(Icons.Filled.Add,"add button")
        }
    }
}

//@Composable
//@Preview
//fun NoteListPreview(navController: NavController){
//    MyNoteTheme  {
//        NoteList(value, modifier = Modifier,navController)
//    }
//}