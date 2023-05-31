package com.stonewater.koincourse

class MainRepositoryImpl(
    private val api: DummyApi
): MainRepository {
    override fun doNetworkCall() {
        api.callApi()
    }
}