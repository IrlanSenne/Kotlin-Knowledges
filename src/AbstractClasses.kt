 abstract class Mamifero(var nome: String) {
    abstract fun falar()
}

 class Cachorro (nome: String): Mamifero(nome) {
     override fun falar() {
            println("au au")
     }
 }

 fun main() {

 }