package com.kanarian.androidclass.imccalculator

import android.icu.text.DecimalFormat
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.slider.RangeSlider
import com.kanarian.androidclass.R

class IMCCalculatorActivity : AppCompatActivity() {

    private var isCardSelected:Boolean =true
    private var lastCardSelected:Int = 0

    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView

    private lateinit var tvHeight: TextView
    private lateinit var rsHeight: RangeSlider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_imccalculator)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initComponents()
        initListeners()
        initUI()
    }

    private fun initComponents() {
        viewMale = findViewById<CardView>(R.id.viewMale)
        viewFemale = findViewById<CardView>(R.id.viewFemale)
        tvHeight = findViewById<TextView>(R.id.tvHeight)
        rsHeight = findViewById<RangeSlider>(R.id.rsHeight)
    }

    private fun initListeners() {
        viewMale.setOnClickListener{
            changeGender(1)
            setGenderColor()
        }
        viewFemale.setOnClickListener{
            changeGender(2)
            setGenderColor()
        }
        rsHeight.addOnChangeListener{_,value,_ ->
            val df =DecimalFormat("#.##")
            val result = df.format(value)
            tvHeight.text = "${result} cm"
        }
    }

    private fun changeGender(card:Int){
        if(lastCardSelected==card){
            return
        }else{
            isCardSelected = !isCardSelected
            lastCardSelected=card
        }
    }

    private fun setGenderColor(){
        viewMale.setCardBackgroundColor(getBackgroundColor(isCardSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(!isCardSelected))
    }

    private fun getBackgroundColor(isViewSelected:Boolean): Int{
        val colorReference = if(isViewSelected){
            R.color.background_component_selected
        }else{
            R.color.background_component
        }

        return ContextCompat.getColor(this,colorReference)
    }

    private fun initUI() {
        setGenderColor()
    }
}