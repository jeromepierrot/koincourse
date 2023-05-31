package com.stonewater.koincourse

import retrofit2.http.GET

interface DummyApi {
    @GET("my/endpoint")
    fun callApi()
}