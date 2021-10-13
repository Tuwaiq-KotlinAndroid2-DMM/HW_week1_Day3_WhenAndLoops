import java.util.*

fun main() {

     var number = arrayOf(28,3,6,5,7,8,9)
     var oddCount =0
     println(Arrays.toString(number))


     for (element in number){

         if (element % 2 !=0) {
             oddCount++
         }
     }

    println("There are $oddCount odds numbers in the array")
}