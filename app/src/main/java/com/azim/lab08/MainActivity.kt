package com.azim.lab08

import android.content.Intent
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.azim.lab08.databinding.ActivityMainBinding
import com.google.android.material.slider.Slider

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lateinit var slider: SeekBar
        lateinit var value: TextView

        slider = binding.seekbar
        value = binding.sizeTextView



        binding.scheduleButton.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)

            // Retrieve the data
            intent.putExtra("name",binding.nameEditText.text.toString())
            intent.putExtra("phone",binding.phoneEditText.text.toString())

            // Open Activity Detail Activity
            startActivity(intent)
        }
    }
}