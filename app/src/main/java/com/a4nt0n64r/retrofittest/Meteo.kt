package com.a4nt0n64r.retrofittest

class Meteo {

    public lateinit var date: String
    public lateinit var tod: String
    public lateinit var temp: String

    override fun toString(): String {
        return "$date | $tod | $temp"
    }
}