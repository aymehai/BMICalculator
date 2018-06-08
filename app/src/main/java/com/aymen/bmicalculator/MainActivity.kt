package com.aymen.bmicalculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClickListenerForButton() //calls method setOnClickListenerForButton
    }

    //calculates BMI based on user input
    private fun calculateBMI():Double{
        //gets weight
        var weight: Double = (numWeight.getText().toString().toDouble())
        //gets height
        var height: Double = (numHeight.getText().toString().toDouble())
        //returns BMI
        return (weight / height / height)
    }

    private fun setOnClickListenerForButton(){
        btnCalculateBMI.setOnClickListener{
            val intent = Intent("com.aymen.bmicalculator.BMIResultsScreen")
            intent.putExtra("BMIResult",calculateBMI())
            startActivity(intent)
        }
    }
}
