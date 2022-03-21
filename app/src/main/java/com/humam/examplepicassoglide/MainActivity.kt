package com.humam.examplepicassoglide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.humam.examplepicassoglide.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image = binding.image

        Picasso.get().load("https://cdn1-production-images-kly.akamaized.net/pogVcFDXnbj3rbujLAJWTxofb7c=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2928642/original/003638000_1570024795-ivan-jevtic-p7mo8-CG5Gs-unsplash.jpg")
            .placeholder(R.drawable.rodhi)
            .error(R.drawable.ic_launcher_background)
            .into(image)

//        Glide.with(this)
//            .load("https://cdn1-production-images-kly.akamaized.net/pogVcFDXnbj3rbujLAJWTxofb7c=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2928642/original/003638000_1570024795-ivan-jevtic-p7mo8-CG5Gs-unsplash.jpg")
//            .error(R.drawable.ic_launcher_background)
//            .into(image)

    }
}