package main.kotlin

class Gear(private val chainRing: Int, private val cog: Int) {

    fun ratio(): Float {
        return chainRing.toFloat()/cog.toFloat()
    }
}