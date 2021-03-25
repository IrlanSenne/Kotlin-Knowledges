private fun generateSearchKeyWords(inputText: String): List<String> {

    var keyWords = mutableListOf<String>()
    generateSimple(inputText, keyWords)

    return keyWords
}


private fun generateSimple(txt: String, keywords: MutableList<String>) {

    var inputString = txt
    val words = inputString.split(" ")
    for(word in words) {
        var appendString = ""
        for(charPosition in inputString.indices) {
            appendString += inputString[charPosition].toString().replace("á","a").replace("ã","a")
                .replace("â","a").replace("é","e").replace("ê","e")
                .replace("í","i").replace("ó","o").replace("ô","o").replace("ú","u")
            if(appendString.length > 3) {
                keywords.add(appendString.toLowerCase())
            }

        }
        inputString = inputString.replace("$word ", "")
    }
}



fun main() {
    var inputText = generateSearchKeyWords("O primeiro amor")
    var teste  = HashMap<String, Any>()
    teste["key_words"] = inputText
    println(teste["key_words"])

}