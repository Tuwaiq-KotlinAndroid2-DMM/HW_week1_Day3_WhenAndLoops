fun main() {
    var age = arrayOf(22,24,29,26,25,23,27,24,31)

    var sum = 0
    for (element in age){

        sum+= element
    }
    var average = sum.toDouble()/age.size
    println("Averege = " + average)

}