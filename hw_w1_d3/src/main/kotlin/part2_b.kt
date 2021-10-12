import com.sun.jdi.IntegerValue

fun main(){
var total=0
    var num= arrayOf(28,3,6,5,7,8,9)
 println(num.asList())
  for (n in num)

  {
      if (n%2 !=0){
total++

       }

      }
  println("there are " + total+ " oods number in the array")
  }



