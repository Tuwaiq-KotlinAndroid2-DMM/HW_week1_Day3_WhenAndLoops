fun main() {
    print("Enter a number of any length:")
    var number = Integer.valueOf(readLine())
    reverseNumber(number)

}

fun reverseNumber(num: Int){
    var originalNumber = num
    var reveresedNumber = 0
    while (true){
        reveresedNumber = (reveresedNumber * 10) + (originalNumber % 10)
        originalNumber /= 10
        if (originalNumber == 0) break
    }
    println("There number revered is $reveresedNumber")
}