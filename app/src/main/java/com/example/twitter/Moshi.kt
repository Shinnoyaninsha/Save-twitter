package com.example.twitter

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val tokken:String ="Bearer"+" "+"AAAAAAAAAAAAAAAAAAAAAO80lAEAAAAAozx48NkNnEnMqYi5XpP1RFwT3Mg%3DWstl3aQ13pwkndkXiTP8rAqO0lXfOgavyoQhedLLK68JrelP1I"
val Baseurl:String="https://api.twitter.com/"
    private val moshi : Moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    val retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(Baseurl)
        .build()
object API {
    val retrofitService: SimpleService by lazy {
        retrofit.create(SimpleService::class.java)
    }



}


