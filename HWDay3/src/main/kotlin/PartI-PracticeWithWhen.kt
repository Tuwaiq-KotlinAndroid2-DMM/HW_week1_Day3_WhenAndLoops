fun main() {

    println("Enter the number of the month")

    var month = Integer.valueOf(readLine())
    var n1 = 30
    var n2 = 28
    var n3 = 31

    when(month) {



        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("Septemper")
        10 -> println("October")
        11 -> println("November")
        12 -> println("December")
        else -> println("Invalid month")

    }
    if (month == 4 || month == 6 || month == 9 || month == 11)
    {
        println("has $n1 days " )
    }
    else if (month == 2)
    {
        println("has $n2 days " )
    }
    else
    {
        println("has $n3 days " )
    }





}