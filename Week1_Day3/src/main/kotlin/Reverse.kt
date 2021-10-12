fun main() {

    println("Please Enter a Number:")
    var num=Integer.valueOf(readLine())

    var reversed = 0

    while (num != 0) {
        var digit = num % 10
        reversed = reversed * 10 + digit
        num = num / 10
    }
    println("Reversed Number: $reversed")
}