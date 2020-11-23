package com.example.myapplication.menu_ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class NameAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val data:MutableList<String> = mutableListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        return NameViewHolder(inflater, parent)
    }

    private class NameViewHolder(inflater: LayoutInflater, parent: ViewGroup): RecyclerView.ViewHolder(inflater
        .inflate(R.layout.favorite_item, false)) {

        private val btn_rec: View = itemView.
        fun bind(item:String){

        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as NameViewHolder).bind(data[position])
    }

    override fun getItemCount(): Int = data.size

}