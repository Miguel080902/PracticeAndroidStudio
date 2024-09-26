package com.kanarian.androidclass

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kanarian.androidclass.firstapp.FirstAppActivity
import com.kanarian.androidclass.imccalculator.IMCCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnSaludoApp=findViewById<AppCompatButton>(R.id.btnSaludoApp)
        val btnIMCApp=findViewById<AppCompatButton>(R.id.btnIMCApp)

        btnSaludoApp.setOnClickListener { navigateToSaludoApp() }
        btnIMCApp.setOnClickListener { navigateToIMCApp() }
    }

    private fun navigateToIMCApp() {
        val intent = Intent(this, IMCCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludoApp(){
        val intent = Intent(this,FirstAppActivity::class.java)
        startActivity(intent)
    }
}