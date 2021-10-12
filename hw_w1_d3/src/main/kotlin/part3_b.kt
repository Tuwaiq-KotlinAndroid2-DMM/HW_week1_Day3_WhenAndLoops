fun main() {/*
    var count1=0
    var count2=0
    var count3=0*/

    println("please enter the number or if you want end the program enter END :")
    var count1 = 0
    var count2 = 0
    var count3 = 0
    var end2 = "END"
    var end1 = readLine()
    while (true) {

        var num = Integer.valueOf(readLine())
        if (num > 0) {
            count1++
        } else if (num < 0) {
            count2++
        } else if (num == 0) {
            count3++
        } else if (end1 == end2)
            break
        println("the positive numbers : $count1")

        println("the negative numbers : $count2")
        println("zero nubers : $count3")
    }

}

