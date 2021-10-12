fun main() {
    var arr = arrayOf(6,4,3,1,9,6,7,8,55,66)
    var counter = 0
    for (i in arr){
        if (i % 2 != 0){
          counter += 1
        }
    }
    println("There are $counter odd numbers in the array")
}