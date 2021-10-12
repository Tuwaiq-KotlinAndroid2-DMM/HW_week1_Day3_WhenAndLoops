fun main() {
    println("Enter the number of month: ")
    var numOfMonth = Integer.valueOf(readLine())
    var array = arrayOf(
        "Januray", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "Novmber", "December"
    )
    if (numOfMonth > 12)
        println("Invalid month")
    else {
        var month = array[numOfMonth - 1]
        when (numOfMonth) {
            2 -> println("$month has 28 days.")
            4, 6, 9, 11 -> println("$month has 30 days.")
            else -> println("$month has 31 days.")
        }
    }

}