package com.example.myrestapp_cosenzaolga

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        findViewById<Button>(R.id.SearchFilm).setOnClickListener {
            startActivity(Intent(this, activity_search::class.java))
        }

        findViewById<Button>(R.id.RentFilm).setOnClickListener {
            startActivity(Intent(this, WebViewActivity::class.java))
        }

        findViewById<Button>(R.id.BookCinema).setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
    }
}