package travellingSalesman

import java.util.Random
import kotlin.math.roundToInt
import kotlin.math.sqrt

data class TravellingSalesman(val x: Int, val y: Int, val size: Int) {
    private val r = Random()
    val points = generateRandomList(x, y, size - 1)
    var score = 0
    var bestOption = mutableListOf<Point>()
    fun idk() {
        points.forEach { println(it) }
    }


    fun travel() {
        //Point with whom you are working rn
        var actualPoint = points[0]
        var actualOption = mutableListOf<Point>()
        points.removeAt(0)
        for (i in points) {

        }

    }

    fun roadValue(p1: Point, p2: Point): Int {
        val points = listOf(p1, p2)
        val x = points.maxOf { it.x } - points.minOf { it.x }
        val y = points.maxOf { it.y } - points.minOf { it.y }
        return sqrt(((x * x).toDouble() + (y * y).toDouble())).roundToInt()
    }

    private fun generateRandomList(maxX: Int, maxY: Int, size: Int): MutableList<Point> {
        val output = mutableListOf<Point>()
        for (i in 0..size) {
            val x = (r.nextInt(maxX - (maxX / 25)))
            val y = (r.nextInt(maxY - (maxY / 25)))
            output.add(Point(x, y))
        }
        return output
    }
}
