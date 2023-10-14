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
        //setando a quantidade de seguidores
        binding.followerrsIndicator.setCounter("1.5M")
        //setando o texto do indicador
        binding.followerrsIndicator.setIndicator("Followers")
        //setando se o indicador é negrito ou não
        binding.followerrsIndicator.setBold(true)
        //setando se nosso componente foi visualizado ou não
        binding.profileImage.setVisualized(true)
        //setando a imagem de perfil
        binding.profileImage.setImageProfile(R.drawable.ryu)


        //setando o click listener para o nosso custom view
        binding.profileImage.setOnClickListener {
            this.binding.profileImage.setVisualized(
                //inverte o valor do visualized, para alterar a cor do card
                !this.binding.profileImage.isVisualized()
            )
        }
    }
}