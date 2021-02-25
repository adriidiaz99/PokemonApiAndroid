package com.diazsantosadri.apipokemon_miprimeralista.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.diazsantosadri.apipokemon_miprimeralista.R
import com.diazsantosadri.apipokemon_miprimeralista.poko.Pokemon

/**
 * A fragment representing a list of Items.
 */
class PokemonFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pokemon_list, container, false)

        var pokemonList = mutableListOf<Pokemon>(
                Pokemon("bulbasaur", "1"),
                Pokemon("ivysaur", "2")
        )

        // Set the adapter
        with(view as RecyclerView) {
            layoutManager = LinearLayoutManager(context)
            adapter = MyPokemonRecyclerViewAdapter(pokemonList)
        }
        return view
    }
}