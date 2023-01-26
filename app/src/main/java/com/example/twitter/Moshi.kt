package com.example.twitter

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import okhttp3.logging.HttpLoggingInterceptor


val tokken:String ="Bearer"+" "+"AAAAAAAAAAAAAAAAAAAAAO80lAEAAAAAozx48NkNnEnMqYi5XpP1RFwT3Mg%3DWstl3aQ13pwkndkXiTP8rAqO0lXfOgavyoQhedLLK68JrelP1I"
val Baseurl:String="https://api.twitter.com/"
    private val moshi : Moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
private val interceptor : HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
    this.level = HttpLoggingInterceptor.Level.BODY
}

private val client : OkHttpClient = OkHttpClient.Builder().apply {
    this.addInterceptor(interceptor)
}.build()
private val httpClient = OkHttpClient.Builder()
    val retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(Baseurl)
        .client(client)
        .build()
object API {
    val retrofitService: SimpleService by lazy {
        retrofit.create(SimpleService::class.java)
    }



}


