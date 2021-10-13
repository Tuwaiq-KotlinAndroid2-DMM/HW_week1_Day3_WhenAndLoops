fun main() {
     var num = arrayOf(28,3,6,5,7,8,9)
    var count = 0
    for (element in num)
    {
        if (element % 2 !=0)
            count = count+1
    }
    println("there are $count oods numbers in the array")
}