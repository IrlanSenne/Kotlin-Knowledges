import java.lang.StringBuilder

fun vogal(palavraNormal: String) {
    var palavraArray = StringBuilder()
    var i = 0
    var vogs : Int = 0

    while(i < palavraNormal.length) {
        palavraArray.append(palavraNormal[i])
        i++
    }

    for(ind in palavraArray) {

        println("$ind")
        if(
            ind == 'a' ||
            ind == 'e' ||
            ind == 'i' ||
            ind == 'o' ||
            ind == 'u' ||
            ind == 'A' ||
            ind == 'E' ||
            ind == 'I' ||
            ind == 'O' ||
            ind == 'U'
        ) {
            vogs++
        }
    }
    var consoantes: Int = palavraNormal.length - vogs
    println("Número de vogais: $vogs e $consoantes consoantes")
}

fun main() {
    vogal("Benjamim")
}