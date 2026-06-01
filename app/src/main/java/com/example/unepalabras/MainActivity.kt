package com.example.unepalabras

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etTexto1 = findViewById<EditText>(R.id.etTexto1)
        val etTexto2 = findViewById<EditText>(R.id.etTexto2)
        val etTexto3 = findViewById<EditText>(R.id.etTexto3)
        val etTexto4 = findViewById<EditText>(R.id.etTexto4)
        val btnConcatenar = findViewById<Button>(R.id.btnConcatenar)
        val btnLimpiar = findViewById<Button>(R.id.btnLimpiar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btnLimpiar.setOnClickListener {
            etTexto1.text.clear()
            etTexto2.text.clear()
            etTexto3.text.clear()
            etTexto4.text.clear()
            tvResultado.text = ""
        }

        btnConcatenar.setOnClickListener {
            val resultado = "${etTexto1.text} ${etTexto2.text} ${etTexto3.text} ${etTexto4.text}".trim()
            tvResultado.text = resultado
        }
    }
}