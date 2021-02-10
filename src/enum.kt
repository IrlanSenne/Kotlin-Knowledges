enum class Prioridade1 {
    BAIXA, MEDIA, ALTA
}
enum class Prioridade2(val id : Int) {
    BAIXA (1) { override fun toString(): String { return "Baixa... Não se preocupa" } },
    MEDIA (5) ,
    ALTA (10)
}

class Alarme (var desc :String, var p: Prioridade2)

fun main() {
    println("${Prioridade1.MEDIA}")
    println("${Prioridade2.MEDIA.id}")

    for (i in Prioridade2.values()) {
        println("Declaração : ${i.declaringClass} --- ID : ${i.id} --- Name : ${i.name} --- Ordinal : ${i.ordinal}")
        println(" ${i.id} ---  $i")

    }

    var alarme: Alarme = Alarme("Penha ", Prioridade2.BAIXA)
    println("${alarme.desc} tem prioridade ${alarme.p}")
    println(Prioridade2.BAIXA.id)
}