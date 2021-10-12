fun main() {
    var y = arrayOf(Integer.valueOf(readLine()))
    for (i in y) {
        for (x in 1..10) {
            println("$i * $x = " + i * x)
        }
        println("--------------")
    }
}