package com.example.customviewtutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.customviewtutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // inflate the layout
        setContentView(binding.root) // set the content view

        setValuesOnCustomView()
    }

    //setando os valores para o nosso custom view
    private fun setValuesOnCustomView() {
        binding.followerrsIndicator.setCounter("1.5M")
        binding.followerrsIndicator.setIndicator("Followers")
        binding.followerrsIndicator.setBold(true)
    }
}