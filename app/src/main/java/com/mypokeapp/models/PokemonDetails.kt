package com.mypokeapp.models

data class PokemonDetails(
    val id: Int,
    val name: String,
    val sprites: Sprites,
    val types: List<Type>,
    val height: Int,
    val weight: Int,
    val species: Species
)

data class Sprites(
    val other: OtherSprites
)

data class OtherSprites(
    val officialArtwork: OfficialArtwork
)

data class OfficialArtwork(
    val frontDefault: String
)

data class Species(
    val flavorTextEntries: List<FlavorTextEntry>
)

data class FlavorTextEntry(
    val flavorText: String
)

data class Type(
    val type: TypeName
)

data class TypeName(
    val name: String
)
