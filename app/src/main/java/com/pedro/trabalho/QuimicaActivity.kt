package com.pedro.trabalho

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.pedro.trabalho.adapter.SubjectAdapter
import com.pedro.trabalho.databinding.ActivityQuimicaBinding

class QuimicaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuimicaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuimicaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupSubjectsRecycler()
        setupBackButton()
    }

    private fun setupSubjectsRecycler() {
        val subjects = listOf(
            Subject(
                id = 1,
                title = "Transformações Químicas",
                progress = 75,
                backgroundImage = R.drawable.bg_btn,
                destinationClass = TransformacoesActivity::class.java
            ),
            Subject(
                id = 2,
                title = "Ligações Químicas",
                progress = 45,
                backgroundImage = R.drawable.bg_btn,
                destinationClass = LigacoesActivity::class.java
            ),
            Subject(
                id = 3,
                title = "Equilíbrio Químico",
                progress = 30,
                backgroundImage = R.drawable.bg_btn,
                destinationClass = EquilibrioActivity::class.java
            ),
            Subject(
                id = 4,
                title = "Química Inorgânica",
                progress = 60,
                backgroundImage = R.drawable.bg_btn,
                destinationClass = InorganicaActivity::class.java
            )
        )

        binding.subjectsRecycler.layoutManager = LinearLayoutManager(this)
        binding.subjectsRecycler.adapter = SubjectAdapter(this, subjects)
    }

    private fun setupBackButton() {
        binding.buttonBack.setOnClickListener {
            finish()
        }
    }
}