fun main(args: Array<String>) {

    println("Please, enter the size of array:")

    var arraySize: Int = Integer.valueOf(readLine())

    var intArray = Array<Int>(arraySize) { 0 }

    for (i in 1..intArray.size) {
        println("Please, enter the value of item $i:")

        intArray[i - 1] = Integer.valueOf(readLine())
    }

    var oddCount = 0

    for (item in intArray) {
        if (item % 2 != 0) {
            oddCount++
        }
    }

    print("Number of odd numbers in array = $oddCount")
}