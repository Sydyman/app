package com.ex.app

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    private var count = 0

    val counterData = MutableLiveData<Int>()


    fun plus(){
        counterData.value = count++
    }
    fun minus(){
       counterData.value = count--
    }

}