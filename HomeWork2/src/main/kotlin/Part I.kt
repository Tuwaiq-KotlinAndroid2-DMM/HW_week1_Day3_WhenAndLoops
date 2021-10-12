fun main() {
    println("Enter the number of the month:")
    var month = Integer.valueOf(readLine())
    println("*********************")
    when (month){
        1-> println("January has 31 days" )
        2-> println("February has 29 days")
        3-> println("March has 31 days")
        4-> println("April has 30 days")
        5-> println("May has 31 days")
        6-> println("June has 30 days")
        7-> println("July has 31 days")
        8-> println("August has 31 days")
        9-> println("September has 30 days")
        10-> println("October has 31 days")
        11-> println("November has 30 days")
        12-> println("Decemberhas 31 days")

        else -> println("null")}
        println("*********************")

}
