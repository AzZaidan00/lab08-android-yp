package com.azim.lab08

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.azim.lab08.databinding.ActivityDetailBinding
import com.azim.lab08.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        binding.nameTextView.text = name
        val phone = intent.getStringExtra("phone")
        binding.phoneTextView.text = phone
    }
}