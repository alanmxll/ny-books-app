package com.alanmxll.nybooks.data

import com.alanmxll.nybooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NYTServices {

    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "dj1foN0GRdlh7g1JOWVCbSKVzSPx8uwr",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}