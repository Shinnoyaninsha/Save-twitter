package com.example.twitter

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDAO {
    @Query("SELECT *  FROM Users WHERE id= :id")
    fun getuserdata(id:String):Array<User>
    @Insert
    fun insertuser(vararg user: User)
    @Delete
    fun deleteuser(user: User)
}