fun main() {
    // Calculating the number of days in a month
    println("Please enter a number of a month: ")
    var a = arrayOf(" ","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
    var m = Integer.valueOf(readLine())
    when (m){
        1,3,7,8,10,12-> println("There are 28 days in "+ a[m])
        2-> println("There are 31 days in "+ a[m])
        4,6,9,11-> println("There are 30 days in "+ a[m])
        else -> println("Invalid input!")
    }

}