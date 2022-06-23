package com.generation.sqlitecomroom

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.generation.sqlitecomroom.data.Repository
import com.generation.sqlitecomroom.data.UserDataBase
import com.generation.sqlitecomroom.data.Usuario
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel (application: Application): AndroidViewModel(application) {
    val selectUsers: LiveData<List<Usuario>>
    private val repository: Repository

    init{
        val userDao = UserDataBase.getDatabase(application).userDao()
       repository = Repository(userDao)
        selectUsers = repository.selectUsers

    }

    fun addUser(usuario: Usuario) {
        viewModelScope.launch ( Dispatchers.IO) {
            repository.addUser(usuario)
        }
    }
}