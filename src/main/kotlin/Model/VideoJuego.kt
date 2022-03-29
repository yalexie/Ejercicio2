package Model

class VideoJuego : Entregable {

    var titulo : String
    var horasEstimadas : Int
    var entregado : Boolean
    var genero : String
    var compania : String

    init{
        titulo = ""
        horasEstimadas = 10
        entregado = false
        genero = ""
        compania = ""
    }

    constructor(){
    }

    constructor(titulo_p: String, horasEstimadas_p: Int){
        this.titulo=titulo_p
        this.horasEstimadas=horasEstimadas_p
    }

    constructor(titulo_p: String, horasEstimadas_p: Int, entregado_p: Boolean, genero_p: String, compania_p: String){
        this.titulo = titulo_p
        this.horasEstimadas = horasEstimadas_p
        this.entregado=entregado_p
        this.genero = genero_p
        this.compania = compania_p
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