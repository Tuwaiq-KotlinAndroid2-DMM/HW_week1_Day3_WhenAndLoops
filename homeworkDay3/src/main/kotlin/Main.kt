fun main() {
    println("please enter a month number")
    val numMonth = Integer.valueOf(readLine())
    val arrayMonth = arrayOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")

    if (numMonth > 12)
        println("Invalid month")
    else {
        val month = arrayMonth[numMonth - 1]
        when (numMonth) {
            4, 6, 9, 11 -> println("$month has 30 days.")
            2 -> println("$month has 28 days.")
            else -> println("$month has 31 days.")
        }
    }
}
