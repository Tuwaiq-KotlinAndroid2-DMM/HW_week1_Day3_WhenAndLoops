fun main() {
    // Reverting a number
    println("Enter a number to reverse: ")
    var n = Integer.valueOf(readLine())
    var t = 0
    var r = 0
    while (n>0) {
        t = n % 10
        r= (r * 10) + t
        n = n / 10
    }


    println("Reversed number is $r")


}