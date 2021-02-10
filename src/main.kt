fun maiormenor(idade: Int) {
    if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }
}

fun main() {
    val numero = 2
    val novo = if (numero > 10)  "Maior que 10" else "Menor que 10"
    maiormenor(8)
    println(novo)
}