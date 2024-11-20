package com.mypokeapp.models

data class Pokemon(
    val id: Int,
    val name: String,
    val ImageUrl: String,
    val types: List<Type>,
    val height: Float,
    val weight: Float,
    val description: String
)