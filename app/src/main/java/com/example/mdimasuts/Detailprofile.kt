package com.example.mdimasuts

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class Detailprofile : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailprofile)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val superhero = intent.getParcelableExtra<Data>(HomeFragment.INTENT_PARCELABLE)

        val name: TextView = findViewById(R.id.tv_item_name_detil)
        val imageId: ImageView = findViewById(R.id.img_item_photo_detil)
        val deskripsi: TextView = findViewById(R.id.tv_item_description_detil)

        if (superhero != null) {
            name.text = superhero.name
            imageId.setImageResource(superhero.imageId)
            deskripsi.text = superhero.deskripsi
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}