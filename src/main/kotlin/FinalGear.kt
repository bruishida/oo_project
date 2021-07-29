package main.kotlin

class FinalGear(
    private val chainRing: Int,
    private val cog: Int,
    private val wheel: FinalWheel
) {

    private val formattedChainRing = chainRing.toFloat()

    private val formattedCog = cog.toFloat()

    fun ratio(): Float {
        return formattedChainRing / formattedCog
    }

    fun gearInches(): Float {
        return ratio() * wheel.diameter()
    }
}