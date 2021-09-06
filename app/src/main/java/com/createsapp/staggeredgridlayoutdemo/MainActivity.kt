package com.createsapp.staggeredgridlayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize a mutable list of color
        val colors = mutableListOf(
            "blue", "violet", "superiority",
            "Alice", "orange", "pink",
            "red", "green", "brass",
            "bronze", "ruby", "Apple",
            "Aquamarine", "lime", "yellow",
            "Asparagus", "tangerine"
        )

        recyclerView = findViewById(R.id.recyclerView)

        // initialize staggered grid layout manager
        StaggeredGridLayoutManager(3,//span count
             StaggeredGridLayoutManager.VERTICAL //orientation
     ).apply {
            // specify the layout manager for recycler view
            recyclerView.layoutManager = this
        }

        // finally, data bind the recycler view with adapter
        recyclerView.adapter = RecyclerViewAdapter(colors)
    }
}