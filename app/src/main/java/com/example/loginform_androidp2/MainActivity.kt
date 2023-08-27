package com.example.loginform_androidp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.*
import com.example.loginform_androidp2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            buttonLogin.setOnClickListener(){
                if(usernameEditText.text.isNullOrBlank()||passwordEditText.text.isNullOrBlank()){
                    Toast.makeText(this@MainActivity, "Please fill Username and Password", Toast.LENGTH_SHORT).show()
                }
                else{
                    val username = "amanda"
                    val password = "terpal"

                    if(usernameEditText.text.toString().equals(username) && passwordEditText.text.toString().equals(password)){
                        Toast.makeText(this@MainActivity, "Login Success", Toast.LENGTH_SHORT).show()
                    }
                    else{
                        Toast.makeText(this@MainActivity, "Login Failed", Toast.LENGTH_SHORT).show()
                    }
                }
            }

        }


    }
}