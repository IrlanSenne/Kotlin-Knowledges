class Pessoa1 (var nome: String) {
    var  ano : Int? = null
    constructor(nome: String,  ano: Int) : this(nome) {
        this.ano = ano
    }
}

class Pessoa2 (var nome: String, val anoNascimento: Int) {
    fun dizer() {
        println("Meu nome é $nome")
    }
}

fun main() {
    var pessoa : Pessoa1 = Pessoa1("Irlan", 1989)
    println("${pessoa.nome} nasceu em  ${pessoa.ano}")
    var pessoa2 : Pessoa2 =  Pessoa2("Ben", 2016)
    println("${pessoa2.nome} nasceu em ${pessoa2.anoNascimento}")
    pessoa2.dizer()
}

