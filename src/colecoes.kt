package XIIIColecoes

data class Receita(val nome: String,
                   val calorias: Int,
                   val ingredientes: List<Ingredientes> = listOf())

data class Ingredientes(val nome: String, val quantidade: Int)

fun main() {

    // Cria lista de dados
    val data = listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingredientes("Farinha", 1),
                Ingredientes("Presunto", 5),
                Ingredientes("Queijo", 10),
                Ingredientes("Molho de tomate", 2),
                Ingredientes("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingredientes("Pão", 1),
                Ingredientes("Hamburguer", 3),
                Ingredientes("Queijo", 1),
                Ingredientes("Catupiry", 1),
                Ingredientes("Bacon", 3),
                Ingredientes("Alface", 1),
                Ingredientes("Tomate", 1)
            )
        )
    )

    // Tenho receitas na lista?
    if(data.size > 0)  println("Há receitas") else println("Não há receitas na lista")

    // Quantas receitas tenho na coleção?
    println("${data.size} receitas")
    // Tenho alguma receita de Lasanha?
 if("Lasanha" in data) println("Oba,! Lasanha") else println("Que pena, não há lasanha")
    // Quantas receitas de Lasanha?

    // Qual a primeira e última receita?
        println("A primeira receita é: ${data.first().nome}")
        println("A última receita é: ${data.last().nome}")
    // Qual a soma de calorias?
    var numCalorias = data.sumBy { it.calorias }
    println("Total de calorias ---- $numCalorias ")
    // Me dê as duas primeiras receitas
    val firstTwo = data.take(2)
    for (n in firstTwo.withIndex()) println("${n.index + 1} - ${n.value.nome}")
    // Sei como fazer panqueca? E sushi?

    // Quais são as comidas com mais de 500 calorias?

    // Qual a receita mais calórica? E a menos calórica?

    // Faça uma lista com o nome dos pratos

    // Qual a média de calor de todas as receitas?

    // Lista de dados simples

    // Eliminar receitas com mesmo nome

    // Ordenar uma lista


    // Inverter uma lista

    // Sei fazer panquecas ? e Sushi ?
    val knowPanqueca = data.filter { it.nome == "Panqueca" }.any()
    println("Sei fazer panqueca ? ${if(knowPanqueca) "sim" else "não"}")
    val knowSushi = data.filter { it.nome == "Sushi" }.any()
    println("Sei fazer sushi ? ${if(knowSushi) "sim" else "não"}")

    // Quais sao as comidas com mais de 500 calorias ?
    val caloriasAcima = data.filter {it.calorias > 500}
        .forEach{ println("${it.nome} tem ${it.calorias} calorias") }

}
