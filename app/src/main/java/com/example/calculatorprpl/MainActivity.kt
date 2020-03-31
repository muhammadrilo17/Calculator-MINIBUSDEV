package com.example.seven7.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatorprpl.R
import kotlinx.android.synthetic.main.activity_main.*
// EKO MUHAMMAD RILO PEMBUDI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnTambah.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("All inputs must be filled!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = this.addition(a, b)
                txtHasil.setText(c.toString())
            }
        }

        btnKurangi.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("All inputs must be filled!!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = this.substraction(a, b)
                txtHasil.setText(c.toString())
            }
        }

        btnBagi.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("All inputs must be filled!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = this.divided(a, b)
                txtHasil.setText(c.toString())
            }
        }

        btnKali.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("All inputs must be filled!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = this.multiple(a, b)
                txtHasil.setText(c.toString())
            }
        }

    }

    fun substraction(a: Double, b: Double): Double {
        return a - b
    }

    fun addition(a: Double, b: Double): Double {
        return a + b
    }

    fun multiple(a: Double, b: Double): Double {
        return a * b
    }

    fun divided(a: Double, b: Double): Double {
        return a / b
    }
}
