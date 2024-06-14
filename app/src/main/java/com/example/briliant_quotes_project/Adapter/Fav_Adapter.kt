package com.example.briliant_quotes_project.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.briliant_quotes_project.Full_Quotes
import com.example.briliant_quotes_project.Model.Quotes_Model
import com.example.briliant_quotes_project.R

class Fav_Adapter(private val context: Context, private var favList: List<Quotes_Model>) :
    RecyclerView.Adapter<Fav_Adapter.FavViewHolder>() {

    class FavViewHolder(itemView: View):ViewHolder(itemView) {
        var quotes =  itemView.findViewById<TextView>(R.id.qoutes)
        var author = itemView.findViewById<TextView>(R.id.author)
        var favcard = itemView.findViewById<CardView>(R.id.favcard)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.like_item, parent, false)
        return FavViewHolder(view)
    }

    override fun getItemCount(): Int {
        return favList.size
    }

    override fun onBindViewHolder(holder: FavViewHolder, position: Int) {
        holder.quotes.text = favList[position].Quotes
        holder.author.text = favList[position].Author
        holder.favcard.setOnClickListener {
            val intent = Intent(context, Full_Quotes::class.java)
            intent.putExtra("Quotes", favList[position].Quotes)
            intent.putExtra("Author", favList[position].Author)
            context.startActivity(intent)
        }
    }
}