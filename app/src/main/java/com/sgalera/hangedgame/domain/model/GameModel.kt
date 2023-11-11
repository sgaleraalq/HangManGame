package com.sgalera.hangedgame.domain.model

import java.lang.Math.random

class GameModel{
    val stringsList = ArrayList<String>()

    init {
        stringsList.add("Prueba")
        stringsList.add("Test")
        stringsList.add("Whatever")
    }

    fun getRandomString(): String{
        val randomIndex = (0 until stringsList.size).random()
        return stringsList[randomIndex]
    }
}