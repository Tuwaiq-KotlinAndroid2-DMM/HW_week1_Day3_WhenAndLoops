fun main() {
    print("Enter a number: ")
    var num = Integer.valueOf(readLine())
    var reversed = 0
    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }
    println("Your number after reverse: $reversed")
}