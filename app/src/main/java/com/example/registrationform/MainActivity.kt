package com.example.registrationform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.isEmpty
import android.widget.Button
import android.widget.EditText
import com.example.registrationform.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registration.setOnClickListener { registration() }


    }

    fun registration() {

        var name = findViewById(R.id.name) as EditText
        var email_address = findViewById(R.id.email_address) as EditText
        var password = findViewById(R.id.password) as EditText
        var re_password = findViewById(R.id.password_renter) as EditText
        var birth_date = findViewById(R.id.birthday_date) as EditText


        if (name == checkNotNull(name)) {

        }

        if (email_address == checkNotNull(email_address)) {

        }
        if (password == checkNotNull(password)) {

        }
        if (re_password == checkNotNull(re_password)) {

        }
        if (birth_date == checkNotNull(birth_date)) {

        }
        if (password == re_password) {

        }



    }
}




