package com.example.argumentdataclass.api

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.argumentdataclass.model.Autor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ViewModel @Inject constructor(
    private val repository: Repository
):ViewModel() {

    val autorResponse:MutableLiveData<List<Autor>> = MutableLiveData()

    fun getAutor(){
        viewModelScope.launch {
            val response = repository.getAutor()
            autorResponse.value = response
        }
    }
}