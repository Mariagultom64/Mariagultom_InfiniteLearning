package com.example.mariagultom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_login: Button = findViewById(R.id.btn_login)
        btn_login.setOnClickListener(this)

        val btn_signup: Button = findViewById(R.id.btn_signup)
        btn_signup.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_login -> {
                val intent = Intent(this@MainActivity, MasukActivity::class.java)
                startActivity(intent)
            }

            R.id.btn_signup -> {
                val intent = Intent(this@MainActivity, DaftarActivity::class.java)
                startActivity(intent)
            }
        }
    }
}