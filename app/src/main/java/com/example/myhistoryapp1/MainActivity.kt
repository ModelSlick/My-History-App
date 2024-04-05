package com.example.myhistoryapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClear = findViewById<Button>(R.id.btnClear)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val txtResult = findViewById<EditText>(R.id.txtResults)
        val txtInfor = findViewById<TextView>(R.id.txtInfor)

        btnCalculate.setOnClickListener {
            val credits = txtResult.text.toString().toInt()

            var age = ""

            if (credits == 52) {
                age =
                    "You are 52 years old, which is the same age historical figure William ShakeSpear died"
            } else if (credits == 95) {
                age =
                    "you are 95 years old, which is the same age historical figure Nelson Mandela died"
            } else if (credits == 20) {
                age =
                    "you are 20 years old, which is the same age historical figure Pocahontas died"
            } else if (credits == 36) {
                age =
                    "you are 36 years old,which is the same age historical figure Diana, Princess of wales died"
            } else if (credits == 41) {
                age =
                    "you are 41 years old, which is the same age historical figure Amelia Earhart died"
            } else if (credits == 85) {
                age =
                    "you are 85 years old, which is the same age historical figure Benjamin Franklin died"
            } else if (credits == 76) {
                age =
                    "you are 76 years old, which is the same age historical figure Albert Einstein died"
            } else if (credits == 56) {
                age =
                    "you are 56 years old, which is the same age historical figure Abraham Lincoln died"
            } else if (credits == 80) {
                age = "you are 80 years old, which is the same age historical figure Plato died"
            } else if (credits == 67) {
                age =
                    "you are 67 years old, which is the same age historical figure George Washington died"
            } else {
                    age = "There is no historical figure found of that age"
            }
            txtInfor.text = age
        }

        btnClear.setOnClickListener {
            txtInfor.text = "" // Clear the text of the TextView
            txtResult.text.clear() // Clear the text of the EditText
        }

    }
    }

