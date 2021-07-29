package main.kotlin

class UnknownClass(private val data: List<List<Int>>) {
    val wheels = wheelify()

    private fun wheelify(): List<Wheel> {
        return data.map { Wheel(it[0], it[1]) }
    }

    fun diameters(): List<Float> {
        return wheels.map { wheel -> wheel.rim.toFloat() + (wheel.tire.toFloat() * 2) }
    }
}