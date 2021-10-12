fun main() {

    println("please enter a number")

    var num = Integer.valueOf(readLine())

    var reversed =0

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }

    println("Reversed Number: $reversed")
}