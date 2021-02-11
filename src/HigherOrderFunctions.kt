
fun operator(x:Int, y:Int, op: (Int, Int) -> Int): Int {
    val ret = op(x,y)
    return ret
}

fun sum (x:Int, y: Int) = x + y

fun main(args: Array<String>) {
    val list = listOf(1,2,3,4)
    //list.forEach { println(it) }

var lamb = { a: Int, b: Int -> a + b }
    println(lamb(2,2))
}



