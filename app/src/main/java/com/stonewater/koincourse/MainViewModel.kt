package com.stonewater.koincourse

import androidx.lifecycle.ViewModel

class MainViewModel(
        private val repository: MainRepository // Dependency Injection using "constructor injection"
    ): ViewModel() {
    fun doNetworkCall() {
        println("[Message]: Network call...")
    }
}