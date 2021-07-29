package main.kotlin

class Gear2(
    private val chainRing: Int,
    private val cog: Int,
    private val rim: Int,
    private val tire: Double
) {
    private val wheel = Wheel2(rim, tire)

    private val formattedChainRing = chainRing.toFloat()

    private val formattedCog = cog.toFloat()

    fun ratio(): Float {
        return formattedChainRing/formattedCog
    }

    fun gearInches(): Float {
        return ratio() * wheel.diameter()
    }
}