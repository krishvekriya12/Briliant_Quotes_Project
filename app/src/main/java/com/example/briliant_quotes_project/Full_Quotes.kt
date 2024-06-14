package com.example.briliant_quotes_project

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.briliant_quotes_project.Dbhelper.Database
import com.example.briliant_quotes_project.databinding.ActivityFullQuotesBinding

class Full_Quotes : AppCompatActivity() {
    private lateinit var binding: ActivityFullQuotesBinding
    var quoteStr = ""
    var authorStr = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFullQuotesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        quoteStr = intent.getStringExtra("Quotes").toString()
        authorStr = intent.getStringExtra("Author").toString()

        binding.qoutes.text = quoteStr
        binding.author.text = authorStr
        binding.fave.setOnClickListener {
            val cursor = Database.db.rawQuery(
                "select * from fav where quote='" + quoteStr + "'",
                null
            )
            if (cursor != null) {
                if (cursor.moveToNext()) {
                    Database.db.execSQL("delete from fav where quote='" + quoteStr + "'")
                    binding.fave.setImageResource(R.drawable.unfav)
                } else {
                    Database.db.execSQL("insert into fav(quote,author) values ('" + quoteStr + "','" + authorStr + "')")
                    binding.fave.setImageResource(R.drawable.baseline_favorite_24)
                }
            }
        }
        binding.textQuotes.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        FavLoad()
    }

    override fun onResume() {
        super.onResume()
        FavLoad()
    }

    fun FavLoad() {
        val cursor = Database.db.rawQuery("select * from fav where quote='" + quoteStr + "'", null)
        if (cursor != null) {
            if (cursor.moveToNext()) {
                binding.fave.setImageResource(R.drawable.baseline_favorite_24)
            } else {
                binding.fave.setImageResource(R.drawable.unfav)
            }
        }

    }

}