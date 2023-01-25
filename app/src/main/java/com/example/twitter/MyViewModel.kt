package com.example.twitter

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

open class MyViewModel(val dao: UserDAO, application: Application) : AndroidViewModel(application) {
    init {
        suspend fun getUser() {
            viewModelScope.launch {
                Log.d("User", API.retrofitService.getUserData("elonmusk", tokken).toString())
            }
        }
        suspend fun getTL() {
            viewModelScope.launch {
                Log.d("TL", API.retrofitService.getTimelines("44196397", tokken).toString())
            }
        }

    }


}