package com.a4nt0n64r.retrofittest

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIservice {

    @GET("inf/meteo.php")
    fun getMeteo(@Query("tid")tid: Int):Call<List<Meteo>>
}