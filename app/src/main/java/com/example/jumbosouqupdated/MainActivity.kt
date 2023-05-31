package com.example.jumbosouqupdated

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jumbosouqupdated.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}