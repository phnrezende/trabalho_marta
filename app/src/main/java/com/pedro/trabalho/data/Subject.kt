package com.pedro.trabalho

data class Subject(
    val id: Int,
    val title: String,
    val progress: Int, // 0 a 100
    val backgroundImage: Int, // ID do drawable
    val destinationClass: Class<*> // Classe para onde levará ao clicar
)