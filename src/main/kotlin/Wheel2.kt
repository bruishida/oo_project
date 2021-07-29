package main.kotlin

data class Wheel2(
    private val rim: Int,
    private val tire: Double
) {
    private val formattedRim = rim.toFloat()
    private val formattedTire = tire.toFloat()

    fun diameter():Float {
        return formattedRim + (formattedTire * 2)
    }
}