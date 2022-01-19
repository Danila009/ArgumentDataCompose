package com.example.argumentdataclass.navigation

const val ARGUMENT_AUTOR ="autor"

const val ROUTE = "route"
const val MAIN_ROUTE = "main_route"

sealed class Screen(val route:String){
    object Main:Screen("main_screen")
    object Autor:Screen("autor_screen?autor={autor}"){
        fun put(
            autor:String
        ):String = "autor_screen?autor=$autor"
    }
}
