package com.example.briliant_quotes_project.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.briliant_quotes_project.Adapter.Fav_Adapter
import com.example.briliant_quotes_project.Dbhelper.Database
import com.example.briliant_quotes_project.HomeActivity
import com.example.briliant_quotes_project.Model.Quotes_Model
import com.example.briliant_quotes_project.databinding.FragmentFavBinding

class Fav_Fragment : Fragment() {
    private lateinit var binding: FragmentFavBinding
    var favlist = ArrayList<Quotes_Model>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFavBinding.inflate(inflater, container, false)
        binding.backbtn.setOnClickListener {
            val intent = Intent(requireContext(), HomeActivity::class.java)
            startActivity(intent)
        }
        FavLoad()
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        FavLoad()
    }

    fun FavLoad() {
        favlist.clear()

        val cursor = Database.db.rawQuery("select * from fav", null)
        if (cursor != null) {
            while (cursor.moveToNext()) {
                val strQuote = cursor.getString(1)
                val strAuthor = cursor.getString(2)
                favlist.add(Quotes_Model(strQuote, strAuthor))
            }
            val adapter = Fav_Adapter(requireContext(), favlist)
            binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
            binding.recyclerView.adapter = adapter
        }
    }
}