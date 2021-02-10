fun main() {
    reverse(5)
}

fun reverse (n1:Int) {
    for (i in 0..n1) {
        for (j in 0..i) {
            print("#")
        }
        print("\n")
    }
}