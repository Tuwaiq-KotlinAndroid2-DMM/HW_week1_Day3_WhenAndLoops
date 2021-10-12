fun main() {
    // Odd numbers in an Array

    var array = arrayOf(28,3,6,5,7,8,9)
    var counter = 0
    var odd = 0
    while(counter < array.size){
        if (array[counter] % 2 !=0) {
            odd++
        }
        counter++
    }
    println("There are $odd odd numbers in the array")

}