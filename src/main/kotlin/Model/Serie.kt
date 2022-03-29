package Model

class Serie : Entregable {

    var titulo : String
    var numTemporadas : Int
    var entregado : Boolean
    var genero : String
    var creador : String

    init{
        titulo = ""
        numTemporadas = 3
        entregado = false
        genero = ""
        creador = ""
    }

    constructor(){
    }

    constructor(titulo_p: String, creador_p: String) {
        this.titulo = titulo_p
        this.creador = creador_p

    }

    constructor(titulo_p: String, numTemporadas_p: Int, genero_p: String, creador_p: String){
        this.titulo = titulo_p
        this.numTemporadas = numTemporadas_p
        this.genero = genero_p
        this.creador = creador_p
    }

    override fun entregar() {
        this.entregado=true
    }

    override fun devolver() {
        this.entregado=false
    }

    override fun isEntregado() : Boolean {
        return this.entregado
    }


}