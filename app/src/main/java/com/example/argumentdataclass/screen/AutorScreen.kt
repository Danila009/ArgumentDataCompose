package com.example.argumentdataclass.screen

import androidx.compose.foundation.border
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.argumentdataclass.model.Autor
import com.example.argumentdataclass.utils.decodeFromString
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@ExperimentalSerializationApi
@Composable
fun AutorScreen(
    autor:String
) {
    val listAutor:List<Autor> = decodeFromString(autor)

    LazyColumn(content = {
        items(listAutor){
            Card(modifier = Modifier.border(1.dp, Color.Red)) {
                Text(text = it.firstName)
            }
        }
    })
}