package com.alanmxll.nybooks.data

import retrofit2.Call
import retrofit2.http.GET

interface NYTServices {

    @GET("list.json")
    fun listRepos(): Call<List<>>
}