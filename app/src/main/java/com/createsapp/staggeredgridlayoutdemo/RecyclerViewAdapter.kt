package com.createsapp.staggeredgridlayoutdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val color: MutableList<String>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        // inflate the custom view from xml layout file
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.custom_view,parent,false)

        // return the view holder
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // display the current color
        holder.color.text = color[position]
    }

    override fun getItemCount(): Int {
        // number of items in the data set held by the adapter
        return color.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val color: TextView = itemView.findViewById(R.id.tvColor)
    }

}