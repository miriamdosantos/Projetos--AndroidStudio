package com.generation.todoandroid

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.todoandroid.api.Repository
import com.generation.todoandroid.model.Categoria
import kotlinx.coroutines.launch
import retrofit2.Response
import java.lang.Exception

class MainViewModel : ViewModel(){
    val respository = Repository()
    private val _myCategoriaResponse = MutableLiveData<Response<List<Categoria>>>()

    val myCategoriaResponse : LiveData<Response<List<Categoria>>> =
        _myCategoriaResponse
    init {
        listCategoria()
    }
    fun listCategoria (){
    viewModelScope.launch {
        try{
            val response = respository.listCategoria()
            _myCategoriaResponse.value = response

        }catch (e: Exception){
            Log.d("Erro", e.message.toString())
        }
    }
    }
}