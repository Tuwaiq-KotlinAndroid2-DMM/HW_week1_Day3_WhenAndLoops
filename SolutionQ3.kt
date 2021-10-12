fun main(){
    var num = arrayOf(28,3,6,5,7,8,9)
    var oddNum = 0

    for(i in num) {
        if (i % 2 != 0)
            oddNum++

    }
    println(num.contentToString())

    println("There are $oddNum odds numbers in the array")
}