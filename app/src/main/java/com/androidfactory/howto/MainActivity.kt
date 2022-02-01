package com.androidfactory.howto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.simpleDataDisplayActivityButton)
        button.setOnClickListener {
            val intent = Intent(this, SimpleDataDisplayActivity::class.java)
            intent.putExtra("data", "Hello from MainActivity")
            startActivity(intent)
        }

        findViewById<Button>(R.id.glideButton).setOnClickListener {
            startActivity(Intent(this, GlideImageLoadingActivity::class.java))
        }
    }
}