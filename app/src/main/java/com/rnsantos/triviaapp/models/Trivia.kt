package com.rnsantos.triviaapp.models

data class Trivia(
    var number: Int,
    var found: Boolean,
    var trivia: String,
    var text: String
)