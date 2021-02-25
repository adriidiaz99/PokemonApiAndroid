package com.diazsantosadri.apipokemon_miprimeralista.poko

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonService {

    @GET("pokemon")
    fun getPokemonList(@Query("offset") paramOffset : String,
                       @Query("limit") paramLimit: String) : Call<PokemonResponse>
}