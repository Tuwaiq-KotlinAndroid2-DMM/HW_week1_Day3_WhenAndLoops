fun main( ) {
  println("Enter the number of the month:")
    var month=Integer.valueOf(readLine())
    var n1="31 Days"
    var n2="30 Days"
    when(month){
        1-> println("January Has $n1")
        2-> println("February Has 28 Days")
        3-> println("March Has $n1")
        4-> println("April Has $n2")
        5-> println("May Has $n1")
        6-> println("June Has $n2")
        7-> println("July Has $n1")
        8-> println("August Has $n1")
        9-> println("September Has $n2")
        10->println("October Has $n1")
        11->println("November Has $n2")
        12-> println("December Has $n1")
        else -> println("Invalid month")


    }

}