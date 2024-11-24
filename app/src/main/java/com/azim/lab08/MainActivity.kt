package com.azim.lab08

import android.app.DatePickerDialog
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
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    // arrayListOf pizzaSize
    val pizzaSize = arrayListOf("Small","Medium","Large","Extra Large")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.seekbar.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                // Update nilai sizeTextView dengan pizzasize
                binding.sizeTextView.text = pizzaSize[progress]
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

        /*
        binding.dateButton.setOnClickListener {
            val c = Calendar.getInstance()
            val day = c.get(Calendar.DAY_OF_MONTH)
            val month = c.get(Calendar.MONTH)
            val year = c.get(Calendar.YEAR)

            val myDatePicker = DatePickerDialog(this,android.R.style.ThemeOverlay,
                DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth -> })

            myDatePicker.show()
        } */

        binding.scheduleButton.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)

            // Retrieve the data
            intent.putExtra("name",binding.nameEditText.text.toString())
            intent.putExtra("phone",binding.phoneEditText.text.toString())
            intent.putExtra("size",binding.sizeTextView.text.toString())

            // Open Detail Activity
            startActivity(intent)
        }
    }
}