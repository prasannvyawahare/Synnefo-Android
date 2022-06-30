package com.example.synnefo.repository

import androidx.lifecycle.LiveData
import com.example.shoppingtest.data.local.SynnefoDao
import com.example.shoppingtest.data.local.SynnefoSession
import com.example.synnefo.data.remote.SynnefoApi
import com.example.synnefo.util.Synnefo
import javax.inject.Inject

class DefaultRepository @Inject constructor(val synnefoApi: SynnefoApi,val synnefoDao: SynnefoDao) {


    suspend fun startSession(synnefo: SynnefoSession){
        synnefoDao.insertSynnefoSession(synnefo)
    }

     fun checkSession():LiveData<SynnefoSession>{
       return synnefoDao.observeSynnefoSession()
    }


}