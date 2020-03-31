package com.example.seven7.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatorprpl.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnTambah.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("Semua input harus diisi!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = this.tambah(a, b)
                txtHasil.setText(c.toString())
            }
        }

        btnKurangi.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("Semua input harus diisi!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = this.kurang(a, b)
                txtHasil.setText(c.toString())
            }
        }

        btnBagi.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("Semua input harus diisi!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = this.bagi(a, b)
                txtHasil.setText(c.toString())
            }
        }

        btnKali.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("Semua input harus diisi!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = this.kali(a, b)
                txtHasil.setText(c.toString())
            }
        }

    }

    fun kurang(a: Double, b: Double): Double {
        return a - b
    }

    fun tambah(a: Double, b: Double): Double {
        return a + b
    }

    fun kali(a: Double, b: Double): Double {
        return a * b
    }

    fun bagi(a: Double, b: Double): Double {
        return a / b
    }
}