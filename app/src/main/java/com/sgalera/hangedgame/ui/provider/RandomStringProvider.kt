package com.sgalera.hangedgame.ui.provider
import javax.inject.Inject
import kotlin.random.Random

class RandomStringProvider @Inject constructor() {
    fun getRandomString(): String? {
        return when(Random.nextInt(0,5)){
            0 -> "beard"
            1 -> "whatever"
            2 -> "trial"
            3 -> "goal"
            4 -> "football"
            else -> null
        }
    }
}