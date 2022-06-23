package com.generation.sqlitecomroom.data

import androidx.lifecycle.LiveData

class Repository (private val userDao: UserDao) {
    val selectUsers : LiveData<List<Usuario>> = userDao.selectUsers()

fun addUser (usuario: Usuario){
    userDao.addUser(usuario)
}
}