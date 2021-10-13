fun main() {

    println("Please enter the number : ")
    var num = Integer.valueOf(readLine())
    var reversed = 0

    while (num != 0) {
        var number = num % 10
        reversed = reversed * 10 + number
        num /= 10
    }

    println("Reversed Number: $reversed")
}