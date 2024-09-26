package com.kanarian.androidclass.firstapp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kanarian.androidclass.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fisrt_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //acceder al boton en el activity
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName =findViewById<AppCompatEditText>(R.id.etName)


        //accion que se realiza al presionar el boton
        btnStart.setOnClickListener{
            val name = etName.text.toString()
            if(name.isNotEmpty())
            Log.i("kanariandev","Boton pulsado $name")
        }
    }
}