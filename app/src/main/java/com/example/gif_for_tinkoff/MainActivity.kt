package com.example.gif_for_tinkoff

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Glide.with(this)
            .asGif()
            .load("http://static.devli.ru/public/images/gifs/201504/16045fb6-0d3c-486f-9562-abd7e9024ab0.gif")
            .error(R.drawable.ic_launcher_background)
            .into(gif)
    }
}