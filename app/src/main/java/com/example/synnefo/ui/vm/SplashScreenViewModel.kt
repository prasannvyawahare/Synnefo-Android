package com.example.synnefo.ui.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.shoppingtest.data.local.SynnefoSession
import com.example.synnefo.repository.DefaultRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class SplashScreenViewModel @Inject constructor(val repository: DefaultRepository):ViewModel() {


        suspend fun startSession(synnefo: SynnefoSession){
            repository.startSession(synnefo)
        }

        fun checkSession(): LiveData<SynnefoSession> {
          return  repository.checkSession()
        }

}