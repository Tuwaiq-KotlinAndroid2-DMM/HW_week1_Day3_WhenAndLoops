fun main() {

    var arry= arrayOf(28,3,6,5,7,8,9)
    println(arry.contentToString())
    var num=0
    for (element in arry ){
        if (element % 2 !=0)
            num ++
    }

    println (" There are " +  num +"  odds numbers in the array")

}



