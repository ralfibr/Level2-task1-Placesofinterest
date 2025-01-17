package com.example.placesofinterest
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.placesofinterest.Data.Place
import kotlinx.android.synthetic.main.item_place.view.*
// Place adapter extend RecyclerView adapter
public class PlaceAdapter(private val places: List<Place>) :
    RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {
//
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        )
    }
// array size
    override fun getItemCount(): Int {
        return places.size
    }
// get places position
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(places[position])
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(place : Place) {
            itemView.ivPlace.setImageResource(place.imageResId)
            itemView.tvPlace.text = place.name
        }
    }

}
