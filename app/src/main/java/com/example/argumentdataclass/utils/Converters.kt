package com.example.argumentdataclass.utils

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@ExperimentalSerializationApi
inline fun <reified T> encodeToString(base:T):String{
    return Json.encodeToString(base)
}

@ExperimentalSerializationApi
inline fun <reified T> decodeFromString(base: String):T{
    return Json.decodeFromString(base)
}