interface Funcionario {
    fun calculaBonus()
}

class Gerente: Funcionario {
    override fun calculaBonus() {
        println("Bônus: 500")
    }
}

class Tecnico: Funcionario {
    override fun calculaBonus() {
        println("Bônus: 200")
    }
}
fun main() {
    val f1: Funcionario = Gerente()
    val f2: Funcionario = Tecnico()
    f1.calculaBonus()
    f2.calculaBonus()
}

