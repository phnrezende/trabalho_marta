package com.pedro.trabalho

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.pedro.trabalho.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.quimica.setOnClickListener {
            val intent = Intent(this, QuimicaActivity::class.java)
            startActivity(intent)
        }

        // navbar
        val navBar = findViewById<LinearLayout>(R.id.navBar)
        navBar.findViewById<ImageView>(R.id.nav_home).setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
        }
        navBar.findViewById<ImageView>(R.id.nav_simulados).setOnClickListener {
            val intent = Intent(this, SimuladosFragment::class.java)
            startActivity(intent)
        }
        navBar.findViewById<ImageView>(R.id.nav_notificacoes).setOnClickListener {
            val intent = Intent(this, NotificacoesFragment::class.java)
            startActivity(intent)
        }
        navBar.findViewById<ImageView>(R.id.nav_perfil).setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
