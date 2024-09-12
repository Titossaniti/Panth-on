package com.example.myapplication.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.model.Olympian

class OlympianViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
    private val descTextView: TextView = itemView.findViewById(R.id.descTextView)
    private val imageView: ImageView = itemView.findViewById(R.id.imageView)

    fun bind(olympian: Olympian) {
        nameTextView.text = olympian.name
        descTextView.text = olympian.description
        Glide.with(itemView.context)
            .load(olympian.imageResId)
            .into(imageView)
    }
}
