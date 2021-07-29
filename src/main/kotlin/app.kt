import main.kotlin.*

fun main() {
//    val chainRing = 52
//    val cog = 11
//    val ratio = chainRing.toFloat()/cog.toFloat()
//    println(ratio)
//    println(Gear(52, 11))
//    println(Gear(52, 11).ratio())
//    println(Gear(30, 27).ratio())
//


//    val data = mutableListOf<List<Int>>()
//    data.add(listOf(622,20))
//    data.add(listOf(622,23))
//    data.add(listOf(559,30))
//    data.add(listOf(559,40))
//
//    println(data)
//
//    println(UnknownClass(data).diameters())


//    println(Gear2(52, 11, 26, 1.5).ratio())


    val wheel = FinalWheel(26, 1.5)
    println(wheel.circumference())
    println(FinalGear(52, 11, wheel).ratio())
    println(FinalGear(52, 11, wheel).gearInches())

}