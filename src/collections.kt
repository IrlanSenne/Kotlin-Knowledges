package collections

fun main(args: Array<String>) {
    // list - array - Set - HashMap

    val li = listOf("Madrid", "Barcelona","Lisboa","Porto")
    val l2 = mutableListOf("Madrid", "Barcelona","Lisboa","Porto")
    val a1 = arrayListOf("Madrid", "Barcelona","Lisboa","Porto")

    val s1 = setOf("Madrid", "Barcelona","Lisboa","Porto")
    val s2 = mutableSetOf("Madrid", "Barcelona","Lisboa","Porto")

    val h1 = hashMapOf<String, String>(Pair("key","value"), Pair("França","Paris"))

    val m1 = mapOf(Pair("key", "value"), Pair("França","Paris"))
    val m2 = mutableMapOf(Pair("key", "value"), Pair("França","Paris"))
    l2.add("Ultimo")

    println(h1.entries)
}