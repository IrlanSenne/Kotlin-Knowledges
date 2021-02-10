open class Maquina(val marca: String) {
    open fun minhaMarca() {
        println("A minha marca é $marca")
    }
}

class Computador(marca: String, val nucleos: Int) : Maquina(marca) {

    override fun minhaMarca() {
        val id = 10
        super.minhaMarca()
        // println("Estou escrevendo e reescrevendo minha Marca")
    }

    fun ligar() {}
    fun processar() {}

    fun overload(i: Int) = println("Overload $i")
    fun overload(i: String) = println("Overload $i")
}

fun main() {
    val c: Computador = Computador("xpto", 10)
    with(c) {
        ligar()
        processar()
        minhaMarca()
    }
}