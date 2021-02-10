class Somebody {
    lateinit var nome: String
    fun namesGenerator() {
        nome = "Paul"
    }
}

fun main() {
    val p = Somebody()
    p.namesGenerator()
}