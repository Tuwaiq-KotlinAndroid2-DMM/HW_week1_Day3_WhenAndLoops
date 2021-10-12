fun main() {
    var array = arrayOf(28,3,6,5,7,8,9,11)
    var counter = 0
    for (element in array){
        if (element % 2 != 0)
            counter++
    }
    println("There are $counter odds numbers in the array")
}