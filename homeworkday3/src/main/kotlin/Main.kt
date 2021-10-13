import javax.print.attribute.IntegerSyntax

fun main() {
   println("please inter a month number")
   var months=Integer.valueOf(readLine())

   when(months) {
      1 -> println("january has 28 days")
      2 -> println("february")
      3 -> println("March")
      4 -> println ("April")
      5 -> println("May")
      6 -> println("June")
      7 -> println("July")
      8 -> println("August")
      9 -> println("September")
      10 -> println("October")
      11 -> println("November")
      12 -> println("December")
   }
}
