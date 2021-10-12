fun main() {
    var number = 0
    while (true){
        println("Enter a positive number:")
        number = Integer.valueOf(readLine())
        if (number > 0) break
    }
    multiplier(number)
}

fun multiplier(x: Int){
    for (i in 1..10){
        println("$x * $i = ${x*i}")
    }
}