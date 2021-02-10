fun operacao(a:Int, b:Int) = when {
    a > b -> println(a)
    b > a -> println(b)
    else ->  println("Números iguais")
}


fun abacaxi(quantidade:Int) = when {
            quantidade < 10 ->
                println("$quantidade - Total : R$ ${quantidade * 3},00")
            else ->
                println("$quantidade Abacaxi - Total : R$ ${quantidade * 2},00")

}

fun peso(peso:Byte) = when {
    peso in 58..60 -> println("$peso kg --- Peso Leve")
    peso in 61..72 -> println("$peso kg --- Peso Médio")
    peso >= 73 -> println("$peso kg --- Peso Pesado")
    else -> println("$peso kg --- Peso Pena")
}

fun main() {
    operacao(15, 50 )
    abacaxi(80)
    peso(18)

}


