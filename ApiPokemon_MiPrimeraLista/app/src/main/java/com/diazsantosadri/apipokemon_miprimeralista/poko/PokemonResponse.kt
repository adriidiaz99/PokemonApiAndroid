package com.diazsantosadri.apipokemon_miprimeralista.poko

data class PokemonResponse(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Pokemon>
)