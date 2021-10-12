fun main() {
    println("Enter the name of a month to know how many days it has")
    var month = readLine()

    when (month) {
        "January","March","May", "July", "August","October","December" -> println("$month has 31 days" )
        "April","June","September", "November"-> println("$month has 30 days" )
        "February"-> println("$month has 28 days" )
    }
}