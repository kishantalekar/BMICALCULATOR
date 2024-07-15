package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    private lateinit var toggleButtonMale: ToggleButton
    private lateinit var toggleButtonFemale: ToggleButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleButtonMale = findViewById(R.id.toggleButtonMale)
        toggleButtonFemale = findViewById(R.id.toggleButtonFemale)

        toggleButtonMale.setOnCheckedChangeListener { _, isChecked ->
            setToggleBackground(toggleButtonMale, isChecked)
            setToggleBackground(toggleButtonFemale, !isChecked)
        }

        toggleButtonFemale.setOnCheckedChangeListener { _, isChecked ->
            setToggleBackground(toggleButtonFemale, isChecked)
            setToggleBackground(toggleButtonMale, !isChecked)
        }
    }
    private fun setToggleBackground(toggleButton: ToggleButton, isChecked: Boolean) {
        val backgroundResource = if (isChecked) R.drawable.toggle_selected else R.drawable.toggle_unselected
        toggleButton.setBackgroundResource(backgroundResource)

    }
}