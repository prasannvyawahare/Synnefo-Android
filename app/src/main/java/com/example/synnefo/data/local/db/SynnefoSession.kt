package com.example.shoppingtest.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "synnefo_session")
data class SynnefoSession(
    var user_name: String,
    var user_password:String,
    var user_login: Int,
    val id: Int? = null
)

