fun main() {
    //var arr = arrayOf(28,3,6,5,7,8,9)
    println("Enter array length")
    var arrLength = Integer.valueOf(readLine())
    var arrayValues = arrayOfNulls<Int>(arrLength)
    println("Enter value for the array:")
    for (i in 0..arrLength-1){
        arrayValues[i] = Integer.valueOf(readLine())
    }
    getOddTotal(arrayValues)
}

fun getOddTotal(arr: Array<Int?>){
    var oddCounter = 0
    for (i in arr){
        if (i != null) {
            if(i%2 != 0){
                oddCounter++
            }
        }
    }
    println("There are $oddCounter odds numbers in the array")
}
