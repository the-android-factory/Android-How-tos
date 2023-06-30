package com.androidfactory.howto

import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.view.SimpleDraweeView

class FrescoImageLoadingActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Fresco.initialize(this)
        setContentView(R.layout.activity_fresco_image_loading)

        val imageUri: Uri = Uri.parse(AssetsURL.IMAGE_URL)
        val button = findViewById<Button>(R.id.button)
        val draweeView = findViewById<SimpleDraweeView>(R.id.draweeView)

        button.setOnClickListener {
            draweeView.setImageURI(imageUri)
        }
    }
}