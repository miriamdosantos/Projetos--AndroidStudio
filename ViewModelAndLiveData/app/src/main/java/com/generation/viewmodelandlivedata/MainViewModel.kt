package com.generation.viewmodelandlivedata

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel :ViewModel() {
    var cont = MutableLiveData <Int> (0)
    fun addNum(){
        cont.value = cont.value?.plus(1)
    }
}