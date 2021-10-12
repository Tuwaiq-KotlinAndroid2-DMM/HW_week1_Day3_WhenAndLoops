fun main() {
    println("Please enter an even number to get its multiplication table")

    var num = Integer.valueOf(readLine())
    var x = 1
    while (x < 11) {
        println("$num * $x = ${num * x}")
        x++
    }

}