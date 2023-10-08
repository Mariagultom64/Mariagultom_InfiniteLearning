package com.example.mariagultom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MasukActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var editUsername: EditText
    private lateinit var editPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)

        editUsername = findViewById(R.id.editUsername)
        editPassword = findViewById(R.id.editPassword)

        val bundle = intent.extras
        if (bundle != null) {
            editUsername.setText(bundle.getString("username"))
            editPassword.setText(bundle.getString("password"))
        }

        val btn_login: Button = findViewById(R.id.btn_login)
        btn_login.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_login -> {
                val intent = Intent(this@MasukActivity, BerandaActivity::class.java)
                intent.putExtra("user",user(editUsername.text.toString(), editPassword.text.toString()))
                startActivity(intent)
            }
        }
    }
}