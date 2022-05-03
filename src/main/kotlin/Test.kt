import org.openrndr.application
import org.openrndr.color.ColorRGBa
import travellingSalesman.TravellingSalesman

fun main() = application {
    configure {
        width = 1280
        height = 720
        windowResizable = true
        title = "Test"
    }

    program {
        val r = 35.0
        val ts = TravellingSalesman(width,height,5)
        println("${ts.points[0]},${ts.points[1]}")
        println(ts.createRoad(ts.points[0], ts.points[1]))
        extend {
            drawer.clear(ColorRGBa.BLACK)
            drawer.fill = ColorRGBa.WHITE

            ts.points.forEach { drawer.circle(it.x.toDouble(),it.y.toDouble(),r) }

            drawer.stroke = ColorRGBa.WHITE
            drawer.lineSegment(10.0, height / 2.0 - 20.0, width - 10.0, height / 2.0 - 20.0)
        }
    }
}
