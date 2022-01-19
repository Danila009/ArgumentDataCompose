package com.example.argumentdataclass.model

import kotlinx.serialization.Serializable

@Serializable
data class Autor(
    val id:String,
    val firstName:String,
    val lastName:String,
    val middleName:String,
    val birthDate:String,
    val deadDate:String?,
    val description:String,
    val photo:String
)

