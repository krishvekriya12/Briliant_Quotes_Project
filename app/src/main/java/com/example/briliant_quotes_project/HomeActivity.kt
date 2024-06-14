package com.example.briliant_quotes_project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.briliant_quotes_project.Fragment.Home_Fragment
import com.example.briliant_quotes_project.Fragment.Fav_Fragment
import com.example.briliant_quotes_project.Fragment.Profile_Fragment
import com.example.briliant_quotes_project.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.bottomappbar.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    loadFragment(Home_Fragment())
                    true
                }
                R.id.fave ->{
                    loadFragment(Fav_Fragment())
                    true
                }
                R.id.Profile -> {
                    loadFragment(Profile_Fragment())
                    true
                }else ->false
            }
        }
        loadFragment(Home_Fragment())
    }
    private fun loadFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame,fragment)
            .commit()
    }

}