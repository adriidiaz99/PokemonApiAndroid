package com.diazsantosadri.apipokemon_miprimeralista.ui

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import coil.load
import com.diazsantosadri.apipokemon_miprimeralista.R

import com.diazsantosadri.apipokemon_miprimeralista.poko.Pokemon

/**
 * TODO: Replace the implementation with code for your data type.
 */
class MyPokemonRecyclerViewAdapter(
    private val values: List<Pokemon>
) : RecyclerView.Adapter<MyPokemonRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_pokemon, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.idView.text = item.name
        holder.avatarView.load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${item.url}.png")
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val idView: TextView = view.findViewById(R.id.text_pokemon)
        val avatarView: ImageView = view.findViewById(R.id.image_view_avatar)
    }
}