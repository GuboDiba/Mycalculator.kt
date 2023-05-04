package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilNum1: TextInputLayout
    lateinit var tilNum2: TextInputLayout
    lateinit var etNum1: TextInputEditText
    lateinit var etNum2: TextInputEditText
    lateinit var btnAddition: Button
    lateinit var btnSubtraction:Button
    lateinit var btnMultiplication:Button
    lateinit var btnDivision:Button
    lateinit var tvAnswer:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()

    }

    fun castView(){
        tilNum1 = findViewById(R.id.tilNum1)
        tilNum2 = findViewById(R.id.tilNum2)
        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        btnAddition = findViewById(R.id.btnAddition)
        btnSubtraction = findViewById(R.id.btnSubtraction)
        btnMultiplication = findViewById(R.id.btnMultiplication)
        btnDivision = findViewById(R.id.btnDivision)
        tvAnswer = findViewById(R.id.tvAnswer)

        btnAddition.setOnClickListener {
            calculations('+')
        }
        btnSubtraction.setOnClickListener {
            calculations('-')
        }
        btnMultiplication.setOnClickListener {
            calculations('x')
        }
        btnDivision.setOnClickListener {
            calculations('/')
        }



    }
    fun calculations(operator:Char){
        val num1 = etNum1.text.toString().toDouble()
        val num2 = etNum2.text.toString().toDouble()
        val answer = when (operator){
            '+' ->num1+num2
            '-' ->num1-num2
            'x' ->num1*num2
            '/' ->num1%num2
            else ->throw IllegalArgumentException("Invalid operator:$operator")


        }
        tvAnswer.text = answer.toString()
    }
}
