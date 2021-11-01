package com.example.registrationform


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registrationform.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding: ActivityMainBinding

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registration.setOnClickListener { registration() }


    }
    }



    fun registration() {

        var name = R.id.name
        var email = R.id.email_address
        var password = R.id.paassword
        var re_password = R.id.password_renter
        var birth_date = R.id.birthday_date


        if ((name && email) && (password && re_password) && birth_date = !empty) {


        } if (password == re_password ){


        }

}



