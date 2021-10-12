fun main() {
    println("Enter a month number")
    var monthNumber = Integer.valueOf(readLine())

    println("${getMonth(monthNumber)} ${getDaysOfMonth(monthNumber)}")

}

fun getMonth(numMonth: Int): String{
    return when (numMonth) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Not a month number"
    }
}

fun getDaysOfMonth(numMonth: Int): String{
    return when (numMonth){
        1,3,5,7,8,10,12 -> "has 31 days"
        2 -> "has 28 days"
        4,6,9,11 -> "has 30 days"
        else -> "The a month"
    }
}