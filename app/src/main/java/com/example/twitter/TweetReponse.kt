package com.example.twitter

import com.squareup.moshi.JsonClass
@JsonClass(generateAdapter = true)
data class TweetReponse(
   val data: List<Tweet>)

@JsonClass(generateAdapter = true)
data class Tweet(
    val created_at:String,
    val id:String,
    val author_id:String,
    val text:String
)
