fun main() {
    println("Please enter a number")
    val number =Integer.valueOf(readLine())
    var x =1
    while (x<10) {
        if (number < 0) {
            println("invalid number")
            break

        }

        val result= number*x

        x++
        println("$number * $x = $result")

    }

}

