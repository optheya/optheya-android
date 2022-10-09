package com.br.optheya_android.models

data class Favorites(
    val image: String? = "",
    val name: String = "",
    val address: String = "",
    val avaliationRate: Float = 0f,
    val qtdReview: Int = 0
)