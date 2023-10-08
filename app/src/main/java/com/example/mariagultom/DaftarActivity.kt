package com.example.mariagultom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class DaftarActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var editUsername: EditText
    private lateinit var editPassword: EditText
    private lateinit var editRepass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        editUsername = findViewById(R.id.editUsername)
        editPassword = findViewById(R.id.editPassword)
        editRepass = findViewById(R.id.editRepass)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button -> {
                val bundle = Bundle()
                bundle.putString("username", editUsername.text.toString())
                bundle.putString("password", editPassword.text.toString())

                val intent = Intent(this@DaftarActivity, MasukActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}