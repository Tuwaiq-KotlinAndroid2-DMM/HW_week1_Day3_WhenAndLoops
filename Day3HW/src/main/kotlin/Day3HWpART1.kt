fun main() {

    println("Enter the number of the month: ")
    var month= Integer.valueOf(readLine())

    var result = when (month) {
        1 -> "January has 31 days"
        2 -> "February has 28 days "
        3 -> "March has 31 days"
        4 -> "April has 30 days"
        5 -> "May has 31 days"
        6 -> "June has 30 days"
        7 -> "July has 31 days"
        8 -> "August has 30 days"
        9 -> "September has 31 days"
        10 -> "October has 30 days"
        11 -> "November has 31 days"
        12-> "December has 30 days"

       /* if (month = 1 ||month =3||month =5||month =7||month =9||month =11 ){

      var  Day30 ="has 31 days"

        }*/
        else -> "Invalid month."
    }
    println("*****************")
    println(result )
    println("*****************")

}