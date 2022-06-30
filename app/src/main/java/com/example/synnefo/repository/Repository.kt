package com.example.synnefo.repository

import androidx.lifecycle.LiveData
import com.example.synnefo.util.Synnefo
import com.google.gson.JsonElement
import retrofit2.Response

interface Repository {

    suspend fun insertSynnefoSession(synnefo: Synnefo)

    suspend fun deleteSynnefoSession(synnefo: Synnefo)

    fun observeSynnefoSession() : LiveData<Float>

    suspend fun api(query: String): Response<JsonElement>
}