package com.azim.lab08

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.azim.lab08.databinding.ActivityDetailBinding
import com.azim.lab08.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nameTextView.text = intent.getStringExtra("name")
        binding.phoneTextView.text = intent.getStringExtra("phone")
        binding.sizeTextView.text = intent.getStringExtra("size")

        binding.sendButton.setOnClickListener {
            binding.rateTextView.text = binding.ratingbar.rating.toString()

            Snackbar.make(binding.root, "Thank you for your rating, we received it!",
                Snackbar.LENGTH_LONG).setAction("Dismiss"){}.show()
        }
    }
}