package com.example.twitter

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.JsonClass

@Entity(tableName="users")
@JsonClass(generateAdapter = true)
data class User (
    @PrimaryKey val name: String,
    val username : String,
    val id : String,
    val profile_image_url : String)