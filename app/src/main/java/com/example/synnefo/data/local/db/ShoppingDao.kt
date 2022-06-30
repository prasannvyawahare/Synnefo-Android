package com.example.shoppingtest.data.local

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SynnefoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSynnefoSession(shoppingItem:SynnefoSession)


    @Delete
    suspend fun deleteSynnefoSession(shoppingItem: SynnefoSession)


    @Query("SELECT * FROM synnefo_session")
    fun observeSynnefoSession():LiveData<SynnefoSession>


}