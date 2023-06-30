package com.androidfactory.howto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.glideButton).setOnClickListener {
            startActivity(Intent(this, GlideImageLoadingActivity::class.java))
        }

        findViewById<Button>(R.id.picassoButton).setOnClickListener {
            startActivity(Intent(this, PicassoImageLoadingActivity::class.java))
        }

        findViewById<Button>(R.id.coilButton).setOnClickListener {
            startActivity(Intent(this, CoilImageLoadingActivity::class.java))
        }

        findViewById<Button>(R.id.uilButton).setOnClickListener {
            startActivity(Intent(this, UILImageLoadingActivity::class.java))
        }

        findViewById<Button>(R.id.frescoButton).setOnClickListener {
            startActivity(Intent(this, FrescoImageLoadingActivity::class.java))
        }
    }
}