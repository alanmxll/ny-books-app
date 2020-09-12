package com.alanmxll.nybooks.data

import com.alanmxll.nybooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NYTServices {

    @GET("list.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "YOUR API KEY",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}