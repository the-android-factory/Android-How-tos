package com.androidfactory.howto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, SimpleDataDisplayActivity::class.java)
            intent.putExtra("data2", "Hello from MainActivity")
            startActivity(intent)
        }
    }
}