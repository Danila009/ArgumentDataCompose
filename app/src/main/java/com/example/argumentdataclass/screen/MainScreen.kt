package com.example.argumentdataclass.screen

import android.util.Log
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.NavController
import com.example.argumentdataclass.api.ViewModel
import com.example.argumentdataclass.model.Autor
import com.example.argumentdataclass.navigation.Screen
import com.example.argumentdataclass.utils.encodeToString
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@ExperimentalSerializationApi
@Composable
fun MainScreen(
    navController: NavController,
    owner: LifecycleOwner,
    viewModel: ViewModel
) {
    val listAutor = remember { mutableStateOf(listOf<Autor>()) }

    viewModel.getAutor()
    viewModel.autorResponse.observe(owner, {
        listAutor.value = it
    })

    val letter = encodeToString(listAutor.value)


    Button(onClick = {
        navController.navigate(Screen.Autor.put(letter))
    }) {
        Text(text = "->>>>")
    }
}