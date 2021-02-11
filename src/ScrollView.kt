package moreclasses

infix fun Int.dobro (value:Int) = println("${ value * 2 == this }")

class Car(val model: String, val maxSpeed: Int) {
    var currentSpeed: Int = 0
        set(value) {
            if(value > maxSpeed) {
                throw Exception("Velocidade maior do que o permnitido")
            }
            field = value
        }
}
fun main(args: Array<String>) {
    val c1 = Car("", 220)
    c1.currentSpeed = 40

    println(c1.currentSpeed)
    10 dobro 1
}