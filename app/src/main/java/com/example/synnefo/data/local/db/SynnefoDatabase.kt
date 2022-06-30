package com.example.shoppingtest.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [SynnefoSession::class], version = 1)
abstract class SynnefoDatabase :RoomDatabase(){


    abstract fun synnedoDao(): SynnefoDao
}