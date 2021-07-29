package main.kotlin

class FinalWheel (
    private val rim: Int,
    private val tire: Double
) {
    private val formattedRim = rim.toFloat()
    private val formattedTire = tire.toFloat()
    fun diameter():Float {
        return formattedRim + (formattedTire * 2)
    }

    fun circumference(): Double {
        return diameter() * Math.PI
    }
}