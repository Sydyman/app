package com.ex.app

import android.content.Context
import android.content.SharedPreferences

class PreferenceHelper(context: Context) {


    private val sharedPreferences: SharedPreferences = context.getSharedPreferences("myPref",Context.MODE_PRIVATE)

    fun save(key:String,value: String){
        val editor = sharedPreferences.edit()
        editor.putString(key,value)
        editor.apply()
    }


    fun getSave(key: String): String? {
        return sharedPreferences.getString(key,null)

    }




}