package com.example.customviewtutorial.componentes

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.customviewtutorial.R
import com.example.customviewtutorial.databinding.ResFollowersIndicatorBinding

class FollowersIndicator(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

    private val binding: ResFollowersIndicatorBinding = ResFollowersIndicatorBinding.inflate(
        LayoutInflater.from(context), this, true
    )

    init {
        context.obtainStyledAttributes(attrs, R.styleable.FollowersIndicator).apply {
            getString(R.styleable.FollowersIndicator_counter)?.let { setCounter(it) }
            getString(R.styleable.FollowersIndicator_indicator)?.let { setIndicator(it) }
            setBold(getBoolean(R.styleable.FollowersIndicator_bold, true))
        }
    }

    fun setCounter(counter: String) {
        binding.tvCounter.text = counter
    }

    fun setIndicator(indicator: String) {
        binding.tvIndicator.text = indicator
    }

    fun setBold(isBold: Boolean) {
        if (isBold) {
            binding.tvCounter.setTypeface(Typeface.DEFAULT_BOLD)
        } else {
            binding.tvCounter.setTypeface(Typeface.DEFAULT)
        }
    }
}