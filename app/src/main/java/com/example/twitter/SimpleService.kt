package com.example.twitter

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path


interface SimpleService {
    @GET("2/users/by/username/:{username}?user.fields=profile_image_url") //Pour retrouver les infos sur un user à partir de son username
    suspend fun getUserData(@Path("username") username:String, @Header("Authorization") tokken:String): List<User>
    @GET("2/users/:id/tweets?exclude=replies,retweets&tweet.fields=attachments,author_id,id,in_reply_to_user_id,public_metrics,referenced_tweets,text")
    suspend fun getTimelines(@Path("id")id:String, @Header("Authorization") tokken:String): List<Post>  //pour retrouver les infos d'un tweet à partir de l'id user

}
