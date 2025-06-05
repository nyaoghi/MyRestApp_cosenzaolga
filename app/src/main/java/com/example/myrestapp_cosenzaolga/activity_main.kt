package com.example.myrestapp_cosenzaolga

import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class activity_main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btnLogin: Button = findViewById(R.id.buttonlogin)
        var name: EditText = findViewById(R.id.name)
        var password: EditText = findViewById(R.id.password)

        val usernameString = name.text.toString()
        val passwordString = password.text.toString()


        btnLogin.setOnClickListener {
            val user = name.text.toString()
            val pass = password.text.toString()

            if (user == "Utente" && pass == "Ciao123") {
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Credenziali non valide", Toast.LENGTH_SHORT).show()
            }
        }

    }
    }


