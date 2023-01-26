package com.example.twitter

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path


interface SimpleService {

 @GET("2/tweets/search/recent?query=from:elonmusk&tweet.fields=created_at&expansions=author_id&user.fields=created_at")
 suspend fun getTweets(@Header("Authorization") tokken: String): TweetReponse
//suspend fun getTweets(@Path("username") username:String qui aurait été récupéré de l'input box mais ça marche pas
}
