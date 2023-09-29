package com.example.cyclesawa

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BicycleAdapter(private val bicycleList: List<Bicycle>) : RecyclerView.Adapter<BicycleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BicycleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_bicycle, parent, false)
        return BicycleViewHolder(view)
    }

    override fun onBindViewHolder(holder: BicycleViewHolder, position: Int) {
        val bicycle = bicycleList[position]
        holder.bind(bicycle)
    }

    override fun getItemCount(): Int {
        return bicycleList.size
    }
}

//class BicycleAdapter {
//}