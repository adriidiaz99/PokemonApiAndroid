package com.diazsantosadri.apipokemon_miprimeralista

import androidx.lifecycle.ViewModel
import com.diazsantosadri.apipokemon_miprimeralista.poko.Pokemon
import com.diazsantosadri.apipokemon_miprimeralista.poko.PokemonResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PokemonViewModel : ViewModel(){

    var BaseUrl : String = "https://www.relsellglobal.in/tutorial_blogs/"
    val retrofit = Retrofit.Builder ()
        .baseUrl (BaseUrl)
        .addConverterFactory (GsonConverterFactory.create ())
        .build()

    val service = retrofit.create(Pokemon::class.java)

    val call = service







}