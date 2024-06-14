package com.example.briliant_quotes_project.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.briliant_quotes_project.Full_Quotes
import com.example.briliant_quotes_project.Model.Quotes_Model
import com.example.briliant_quotes_project.R

class QuotesList_Adapter(val quotesList: ArrayList<Quotes_Model>, val context: Context, var favclicke: Favclicke,
) :
    RecyclerView.Adapter<QuotesList_Adapter.QuotesViewHolder>() {

    public interface Favclicke {
        fun getposition(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuotesViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.quotes_item, parent, false)
        return QuotesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return quotesList.size

       
    }


    override fun onBindViewHolder(holder: QuotesViewHolder, position: Int) {
        val currentItem: Quotes_Model = quotesList[position]
        holder.qoutes.text = quotesList[position].Quotes
        holder.author.text = quotesList[position].Author
        holder.card.setOnClickListener {
            val intent = Intent(context, Full_Quotes::class.java)
            intent.putExtra("Quotes", quotesList[position].Quotes)
            intent.putExtra("Author", quotesList[position].Author)
            context.startActivity(intent)
        }

    }

    class QuotesViewHolder(itemView: View) : ViewHolder(itemView) {
        var qoutes: TextView = itemView.findViewById(R.id.qoutes)
        var author: TextView = itemView.findViewById(R.id.author)
        var card = itemView.findViewById<CardView>(R.id.card)
        var share = itemView.findViewById<ImageView>(R.id.share)
        var copy = itemView.findViewById<ImageView>(R.id.copy)


    }
}


