package com.androidfactory.howto

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import coil.load

class CoilImageLoadingActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coil_image_loading)

        val imageUrl = "https://lh3.googleusercontent.com/uk_DffZl4yOQHwnr-B6mVg3pg_JJCynj6irOdSYkckcNrFK5n0fZ98JR8jgJKCaiDF1QYvjeW4_tGZDgyS1tl4g0Cg5WQ4xhLwGK=w600"
        val button = findViewById<Button>(R.id.button)
        val imageView = findViewById<ImageView>(R.id.imageView)

        button.setOnClickListener {
            imageView.load(imageUrl)
        }
    }
}