fun main() {

    println("Please enter the month number")

    var month = Integer.valueOf(readLine())

    when(month){
        1-> println("January has 31 days")
        2-> println("February has 28 days")
        3-> println("March has 31 days")
        4 -> println("April has 30 days")
        5 -> println("May has 31 days")
        6 -> print("June has 30 days")
        7 -> println("July has 31 days")
        8 -> println("August has 31 days")
        9 -> println("September has 30 days")
        10 -> println("October has 31 days")
        11 -> println("November has 30 days")
        12 -> println("December has 31 days")
        else-> println("months can be 1-12")
    }


}
/////////////////////////////////////////////////////////////////////

fun main() {


    println("Please enter a number")
    var number= readLine()
    var x=10
    while (x<10){
        println("result"+number +"  "+x)
        x++
    }
}



///////////////////////////////////////////


fun main() {

    var odd= arrayOf(28,3,6,5,7,8,9)

    var max =0
    for (element in odd){

        if (element>max){
            max = element
        }
    }

    println(max)
}