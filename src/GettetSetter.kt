class Homem (var idade : Int) {
    var ano : Int = 0
    get() {
        return field
    }set(value) {
       field = value
    }
}


fun main() {
    var teste = Homem(50)
    println(teste.ano)
}