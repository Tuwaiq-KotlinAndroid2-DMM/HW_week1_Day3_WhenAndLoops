fun main() {


    print("Enter the number of month: ")
    var month = Integer.valueOf(readLine())
    var numDays =0
    var year = 2021
    when  (month){

        1-> println("January")
        2-> println("February")
        3-> println("March")
        4-> println("April")
        5-> println("May")
        6-> println("June")
        7-> println("July")
        8-> println("Augest")
        9-> println("September")
        10-> println("October")
        11-> println("November")
        12-> println("December")
        else->println("Invalid month number")

    }


    if (month ==1 || month == 3 || month == 5 || month ==7 || month == 10 || month == 12){

        println("******************")
        println("$month has 31 days")
        println("******************")

    }else if (month ==4 || month == 6 || month == 9 || month ==11){

        println("******************")
        println("$month has 30 days")
        println("******************")

    }


}