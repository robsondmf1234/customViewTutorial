package com.example.customviewtutorial.componentes

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.customviewtutorial.R
import com.example.customviewtutorial.databinding.ResFollowersIndicatorBinding

class FollowersIndicator(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

    //binding para recuperar os elementos do layout(res_followers_indicator.xml)
    private val binding: ResFollowersIndicatorBinding = ResFollowersIndicatorBinding.inflate(
        LayoutInflater.from(context), this, true
    )

    //init é o construtor da classe, sera chamado quando a classe for instanciada
    init {
        //recuperamos os atributos definidos no xml(FollowersIndicator) que esta no arquivo attrs.xml
        //estamos utilizando a scope function apply para recuperar os atributos e ja aplicar(this)
        context.obtainStyledAttributes(attrs, R.styleable.FollowersIndicator).apply {


            //Dentro do contexto do this, estamos definindo qual tipo de dados estaremos utilizando do arquivo de attrs.xml
            // e chamaremos o metodo setCounter para seta-lo.
            // getString , nao sendo nulo setamos o valor do counter(setCounter)
            getString(R.styleable.FollowersIndicator_counter)?.let { setCounter(it) }
            //Dentro do contexto do this , estamos definindo qual tipo de dados estaremos utilizando do arquivo de attrs.xml
            //e chamaremos o metodo setIndicator para seta-lo. GetString , nao sendo nulo setamos o valor do indicator(setIndicator)
            getString(R.styleable.FollowersIndicator_indicator)?.let { setIndicator(it) }
            //Dentro do contexto do this, chamamos o metodo getBoolean , nao sendo nulo setamos o valor do bold(setBold)
            setBold(getBoolean(R.styleable.FollowersIndicator_bold, true))
        }
    }

    //Função para setar o valor de counter
    fun setCounter(counter: String) {
        binding.tvCounter.text = counter
    }

    //Função para setar o valor de indicator
    fun setIndicator(indicator: String) {
        binding.tvIndicator.text = indicator
    }

    //Função para setar o valor de bold
    fun setBold(isBold: Boolean) {
        if (isBold) {
            binding.tvCounter.setTypeface(Typeface.DEFAULT_BOLD)
        } else {
            binding.tvCounter.setTypeface(Typeface.DEFAULT)
        }
    }
}