package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Olympian

class OlympianAdapter(private val olympians: List<Olympian>) : RecyclerView.Adapter<OlympianViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OlympianViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pantheon, parent, false)
        return OlympianViewHolder(view)
    }

    override fun onBindViewHolder(holder: OlympianViewHolder, position: Int) {
        holder.bind(olympians[position])
    }

    override fun getItemCount(): Int = olympians.size
}

