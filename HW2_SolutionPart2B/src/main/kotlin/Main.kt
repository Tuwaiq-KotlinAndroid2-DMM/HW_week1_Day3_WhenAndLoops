import java.util.Arrays
import java.util.Arrays.toString

fun main(args: Array<String>) {
    var array = intArrayOf(28, 3, 6, 5, 7, 8, 9)
    var count = 0
    println(Arrays.toString(array))
    for (element in array) {

        if (element % 2 != 0) {

            count++

        }

    }

    println("There are $count odds numbers in the array")

}