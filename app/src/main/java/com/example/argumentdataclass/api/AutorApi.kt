package com.example.argumentdataclass.api

import com.example.argumentdataclass.model.Autor
import com.example.argumentdataclass.utils.Constants.GET_AUTOR
import retrofit2.http.GET

interface AutorApi {

    @GET(GET_AUTOR)
    suspend fun getAutor():List<Autor>
}