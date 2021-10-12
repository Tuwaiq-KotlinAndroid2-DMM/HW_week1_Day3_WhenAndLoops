fun main() {
    var num = Integer.valueOf(readLine())
    var rev = 0

    while (num != 0) {
        val digit = num % 10
        rev = rev * 10 + digit
        num /= 10
    }

    println("Reversed Number: $rev")

}
