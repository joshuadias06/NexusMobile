package com.primus.nexus.welcome

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.primus.nexus.R
import com.primus.nexus.auth.LoginActivity

class ActivityWelcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)

        // Ajuste visual para status bar e gestos
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Define progressão inicial como zero
        val progressBar = findViewById<ProgressBar>(R.id.progressBarXP)
        val tvNivel = findViewById<TextView>(R.id.tvNivel)
        progressBar.progress = 0
        tvNivel.text = "Nv. 0"

        // Ação do botão "Começar"
        val btnComecar = findViewById<Button>(R.id.btnComecar)
        btnComecar.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
