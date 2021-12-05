package com.arash.altafi.navigationfragment.sample2

import android.content.Context
import android.content.SharedPreferences

class SharedUsserInfo(context: Context){

    var sharedPreferences:SharedPreferences ?= null

    init {
        sharedPreferences = context.getSharedPreferences("user",Context.MODE_PRIVATE)
    }

    fun saveUser(name:String)
    {
        val editor:SharedPreferences.Editor = sharedPreferences!!.edit()
        editor.putString("name",name)
        editor.apply()
    }

    fun getUser():String?
    {
        return sharedPreferences?.getString("name","")
    }

}