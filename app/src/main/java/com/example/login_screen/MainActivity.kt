package com.example.login_screen

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.login_screen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        submit()
    }

    private fun submit(){
        binding.buttonSubmit.setOnClickListener {
            val userName = binding.editUsername.text.toString().trim()
            val password = binding.editPassword.text.toString().trim()

            if(!userName.isEmpty() && !password.isEmpty()) {
                if(userName.equals("kelson") && password.equals("kotlin")) {
                    Toast.makeText(applicationContext, "Success", Toast.LENGTH_SHORT).show()
                    clear()
                } else {
                    Toast.makeText(applicationContext, "Login Failed", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(applicationContext, "Empty Blanks", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun clear() {
        binding.editUsername.setText("")
        binding.editPassword.setText("")
    }
}