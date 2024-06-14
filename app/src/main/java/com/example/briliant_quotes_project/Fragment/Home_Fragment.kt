package com.example.briliant_quotes_project.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.briliant_quotes_project.Adapter.QuotesList_Adapter
import com.example.briliant_quotes_project.Dbhelper.Database
import com.example.briliant_quotes_project.Model.Quotes_Model
import com.example.briliant_quotes_project.R
import com.example.briliant_quotes_project.databinding.FragmentHomeBinding

class Home_Fragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    var qouteslist = ArrayList<Quotes_Model>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        qouteslist.add(
            Quotes_Model(
                "You must be the change you wish to see in the world", "– Mahatma Gandhi"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Spread love everywhere you go. Let no one ever come to you without leaving happier.",
                "— Mother Teresa"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "The only thing we have to fear is fear itself.", "— Franklin D. Roosevelt"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Darkness cannot drive out darkness; only light can do that. Hate cannot drive out hate: only love can do that.",
                "— Martin Luther King Jr."
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Do one thing every day that scares you.", "—  Eleanor Roosevelt"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Well done is better than well said.", "— Benjamin Franklin"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart.",
                "— Helen Keller"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "It is during our darkest moments that we must focus to see the light.",
                "— Aristotle"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Do not go where the path may lead; go instead where there is no path and leave a trail.",
                " Ralph Waldo Emerson"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Be yourself; everyone else is already taken.", "Oscar Wilde"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "If life were predictable, it would cease to be life and be without flavor.",
                "– Eleanor Roosevelt"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "In the end, it's not the years in your life that count. It's the life in your years.",
                "– Abraham Lincoln"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Life is a succession of lessons which must be lived to be understood.",
                " – Ralph Waldo Emerson"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "You will face many defeats in life, but never let yourself be defeated.",
                "– Maya Angelou"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Never let the fear of striking out keep you from playing the game.", "– Babe Ruth"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Life is never fair, and perhaps it is a good thing for most of us that it is not.",
                " – Oscar Wilde"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "The only impossible journey is the one you never begin.", "– Tony Robbins"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "In this life, we cannot do great things. We can only do small things with great love.",
                "– Mother Teresa"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Only a life lived for others is a life worthwhile.", "– Albert Einstein"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "The purpose of our lives is to be happy.", " – Dalai Lama"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "You may say I‘m a dreamer, but I’m not the only one. I hope someday you'll join us. And the world will live as one.",
                "– John Lennon"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "You only live once, but if you do it right, once is enough.", "– Mae West"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.",
                "– Ralph Waldo Emerson"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Don't worry when you are not recognized but strive to be worthy of recognition.",
                "– Abraham Lincoln"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "The greatest glory in living lies not in never falling, but in rising every time we fall.",
                "– Nelson Mandela"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Life is really simple, but we insist on making it complicated.", " – Confucius"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "May you live all the days of your life.", "– Jonathan Swift"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Life itself is the most wonderful fairy tale", "– Hans Christian Andersen"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Do not let making a living prevent you from making a life", "– John Wooden"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Go confidently in the direction of your dreams! Live the life you've imagined.",
                "– Henry David Thoreau"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Keep smiling, because life is a beautiful thing and there's so much to smile about.",
                "– Marilyn Monroe"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "In the depth of winter, I finally learned that within me there lay an invincible summer.",
                "– Albert Camus"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "In three words, I can sum up everything I've learned about life: it goes on.",
                "Robert Frost"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "So we beat on, boats against the current, borne back ceaselessly into the past.",
                "– F. Scott Fitzgerald"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Life is either a daring adventure or nothing.", "– Helen Keller"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "You have brains in your head. You have feet in your shoes. You can steer yourself any direction you choose.",
                "– Dr. Seuss"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Life is made of ever so many partings welded together.", "– Charles Dickens"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma — which is living with the results of other people's thinking.",
                " – Steve Jobs"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Life is trying things to see if they work.", "– Ray Bradbury"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Many of life's failures are people who did not realize how close they were to success when they gave up.",
                "– Thomas A. Edison"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "The secret of success is to do the common thing uncommonly well.",
                "– John D. Rockefeller Jr."
            )
        )
        qouteslist.add(
            Quotes_Model(
                "I find that the harder I work, the more luck I seem to have.", "– Thomas Jefferson"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Success is not final; failure is not fatal: It is the courage to continue that counts.",
                "– Winston S. Churchill"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "The way to get started is to quit talking and begin doing.", "– Walt Disney"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Don't be distracted by criticism. Remember — the only taste of success some people get is to take a bite out of you.",
                "– Zig Ziglar"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Success usually comes to those who are too busy to be looking for it.",
                "– Henry David Thoreau"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "Everything you can imagine is real.", "– Pablo Picasso"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "If you want to make your dreams come true, the first thing you have to do is wake up.",
                "– J.M. Power"
            )
        )
        qouteslist.add(
            Quotes_Model(
                "There are no secrets to success. It is the result of preparation, hard work, and learning from failure.",
                "– Colin Powell"
            )
        )

        binding.risi1.layoutManager = LinearLayoutManager(requireContext())
        binding.risi1.adapter =
            QuotesList_Adapter(qouteslist, requireContext(), object : QuotesList_Adapter.Favclicke {
                override fun getposition(position: Int) {
                    val cursor = Database.db.rawQuery(
                        "select * from fav where quote='" + qouteslist[position].Quotes + "'", null
                    )
                    if (cursor != null) {
                        if (cursor.moveToNext()) {
                            Database.db.execSQL("delete from fav where quote='" + qouteslist[position].Quotes + "'")
//                            holder.fave.setImageResource(R.drawable.unfav)
                        } else {
//                            Database.db.execSQL("insert into fav(quote,author) values ('" + qouteslist[position].Quotes + "','" + quotesList[position].Author + "')")
//                            holder.fave.setImageResource(R.drawable.baseline_favorite_24)
                        }
                    }
                }
            })

        binding.imgmenu.setOnClickListener {
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }
        binding.navigationDrawer.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    Toast.makeText(requireContext(), "Home ", Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.closeDrawer(GravityCompat.START)
                    true
                }

                R.id.fave -> {
                    Toast.makeText(requireContext(), "Favorite ", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.Profile -> {
                    Toast.makeText(requireContext(), "Profile", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
        return binding.root
    }
}