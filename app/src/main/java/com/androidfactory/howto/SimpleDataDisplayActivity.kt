package com.androidfactory.howto

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SimpleDataDisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_data_display)

        val dataToDisplay: String = intent.getStringExtra("data") ?: "No data"

        val textView: TextView = findViewById(R.id.textView)
        textView.text = dataToDisplay
    }
}