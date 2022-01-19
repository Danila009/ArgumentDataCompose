package com.example.argumentdataclass.navigation.navGraph

import androidx.compose.runtime.Composable
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.NavHostController
import com.example.argumentdataclass.navigation.MAIN_ROUTE
import com.example.argumentdataclass.navigation.ROUTE

@Composable
fun NavHost(
    navHostController: NavHostController,
    owner: LifecycleOwner
) {
    androidx.navigation.compose.NavHost(
        navController = navHostController,
        startDestination = MAIN_ROUTE,
        route = ROUTE,
        builder = {
            mainNavGraph(navHostController, owner)
        }
    )
}