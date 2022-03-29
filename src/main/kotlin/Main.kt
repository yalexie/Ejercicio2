import Model.Serie
import Model.VideoJuego

fun main(args: Array<String>) {

    var videojuegos = arrayOf<VideoJuego>()

    val videoJuego1 = VideoJuego("MarioBros",3)
    val videoJuego2 = VideoJuego("Zelda",5)
    val videoJuego3 = VideoJuego("MarioCart",4)
    val videoJuego4 = VideoJuego("CandyCrush",1)
    val videoJuego5 = VideoJuego("CityVille",2)

    videojuegos = videojuegos.plus(videoJuego1)
    videojuegos = videojuegos.plus(videoJuego2)
    videojuegos = videojuegos.plus(videoJuego3)
    videojuegos = videojuegos.plus(videoJuego4)
    videojuegos = videojuegos.plus(videoJuego5)

    var series = arrayOf<Serie>()

    val serie1 = Serie("Friends", "David Crane")
    val serie2 = Serie("GOT", "George R")
    val serie3 = Serie("Good Doctor", "Lee Jang")
    val serie4 = Serie("Dark", "Charles Win")
    val serie5 = Serie("Riverdale", "Roberto Aguirre")

    series = series.plus(serie1)
    series = series.plus(serie2)
    series = series.plus(serie3)
    series = series.plus(serie4)
    series = series.plus(serie5)

    videojuegos[2].entregar()
    videojuegos[4].entregar()
    videojuegos[1].entregar()

    series[3].entregar()
    series[1].entregar()

    var conVG : Int = 0
    var conS : Int = 0

    for (i in videojuegos.indices){
        if(videojuegos[i].entregado == true) {
            conVG++
        }
    }
    for (i in series.indices){
        if(series[i].entregado == true) {
            conS++
        }
    }

    println("Hay "+ conVG +" videojuegos entregados")
    println("Hay "+ conS +" videojuegos entregados")



    println("Program arguments: ${args.joinToString()}")
}