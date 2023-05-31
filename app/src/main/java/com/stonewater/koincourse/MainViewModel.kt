package com.stonewater.koincourse

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val repository = MainRepositoryImpl()

    fun doNetworkCall() {
        repository.doNetworkCall()
    }
}