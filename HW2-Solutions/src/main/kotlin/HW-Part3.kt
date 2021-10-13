fun main() {

    println("Please enter an integer")
    var num = Integer.valueOf(readLine())
    var reverse = 0
/*
    var reverse = num.toString().reversed()
    println(reverse)

 */

   while (num !=0 ){

        reverse = reverse * 10 + num % 10
        num/=10

    }

    println(reverse)



}