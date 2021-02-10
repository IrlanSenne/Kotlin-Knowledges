import java.lang.StringBuilder

fun reversao(a: String): String {
    var frase = StringBuilder()
    var i = a.length - 1

    while (i >= 0) {
        frase.append(a[i])
        i--
    }
    return frase.toString()
}

fun main() {
    println(reversao("Irlan"))
}