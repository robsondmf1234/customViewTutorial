package com.example.customviewtutorial.componentes

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.example.customviewtutorial.R
import com.example.customviewtutorial.databinding.ResProfileImageBinding

//Custom view para a imagem de perfil, simulando o componente do instagram
class ProfileImage(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

    //Recuperando o binding gerado pelo view binding
    private var binding: ResProfileImageBinding =
        ResProfileImageBinding.inflate(LayoutInflater.from(context), this, true)

    //Variável para controlar se o card está visualizado ou não
    private var visualized = false

    //Inicializando o componente
    init {
        context.obtainStyledAttributes(attrs, R.styleable.ProfileImage).apply {
            setImageProfile(getResourceId(R.styleable.ProfileImage_src, R.drawable.profile))
            setVisualized(getBoolean(R.styleable.ProfileImage_visualized, visualized))
        }
    }

    //Metodo para controlar a cor do componente de story do instagram
    fun setVisualized(isVisualized: Boolean) {
        this.visualized = isVisualized
        if (!isVisualized) {
            this.binding.cvProfileImage.setCardBackgroundColor(Color.parseColor("#c6c6c6"))
        } else {
            this.binding.cvProfileImage.setCardBackgroundColor(
                ContextCompat.getColor(
                    context,
                    R.color.instagramColor
                )
            )
        }
    }

    //Metodo para recuperar o valor do visualized
    fun isVisualized(): Boolean {
        return visualized
    }

    //Metodo para setar a imagem de perfil
    fun setImageProfile(resourceId: Int) {
        this.binding.imgProfileImage.setImageResource(resourceId)
    }
}