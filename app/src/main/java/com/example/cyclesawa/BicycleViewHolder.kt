package com.example.cyclesawa

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso



class BicycleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val bicycleNameTextView: TextView = itemView.findViewById(R.id.bicycleNameTextView)
    private val bicycleDescriptionTextView: TextView = itemView.findViewById(R.id.bicycleDescriptionTextView)
    private val bicycleImageView: ImageView = itemView.findViewById(R.id.bicycleImageView)

    fun bind(bicycle: Bicycle) {
        bicycleNameTextView.text = bicycle.name
        bicycleDescriptionTextView.text = bicycle.description

        // Load the bicycle image using a library like Picasso or Glide
        Picasso.get().load(bicycle.imageUrl).into(bicycleImageView)
    }
}

class Picasso {
    companion object {
        fun get(): Any {
            return Picasso
        }
    }
}


//class BicycleViewHolder {
//}