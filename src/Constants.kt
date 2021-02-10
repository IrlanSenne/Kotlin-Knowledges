class Constants {
    companion object {
        val TABLE = "12"
    }
}

object VENDAS{
    val id = 20
    fun aviso() = println("Meta alcançada")
}

fun main() {
    Constants.TABLE.toInt()
    println(Constants.TABLE)
    VENDAS.aviso()
    println(VENDAS.id)

}