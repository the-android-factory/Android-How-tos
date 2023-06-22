package com.androidfactory.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class UILImageLoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uilimage_loading);
        Button button = findViewById(R.id.button);
        ImageView imageView = findViewById(R.id.imageView);

        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.init(ImageLoaderConfiguration.createDefault(this));

        button.setOnClickListener(v -> {
            imageLoader.displayImage(AssetsURL.IMAGE_URL, imageView);
        });

    }
}