package com.example.argumentdataclass.api

import javax.inject.Inject

class Repository @Inject constructor(
    private val autorApi: AutorApi
) {
    suspend fun getAutor() = autorApi.getAutor()
}