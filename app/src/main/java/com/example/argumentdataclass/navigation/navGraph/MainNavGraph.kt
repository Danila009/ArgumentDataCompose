package com.example.argumentdataclass.navigation.navGraph

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.*
import androidx.navigation.compose.composable
import com.example.argumentdataclass.api.ViewModel
import com.example.argumentdataclass.navigation.ARGUMENT_AUTOR
import com.example.argumentdataclass.navigation.MAIN_ROUTE
import com.example.argumentdataclass.navigation.Screen
import com.example.argumentdataclass.screen.AutorScreen
import com.example.argumentdataclass.screen.MainScreen

fun NavGraphBuilder.mainNavGraph(
    navController: NavController,
    owner: LifecycleOwner
) {
    navigation(
        startDestination = Screen.Main.route,
        route = MAIN_ROUTE,
        builder = {
            composable(Screen.Main.route){
                val viewModel = hiltViewModel<ViewModel>()
               MainScreen(
                   navController = navController,
                   owner = owner,
                   viewModel = viewModel
               )
            }
            composable(Screen.Autor.route, arguments = listOf(
                navArgument(
                    ARGUMENT_AUTOR,
                    builder = {
                        type = NavType.StringType
                    }
                )
            )){
                AutorScreen(autor = it.arguments?.getString(ARGUMENT_AUTOR).toString())
            }
        }
    )
}