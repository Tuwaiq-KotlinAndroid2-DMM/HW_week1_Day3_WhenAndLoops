fun main() {

    print("please enter a positive integer ")
    var num = Integer.valueOf(readLine())
    var i =1

    while (i <= 10){

        val product = num*i
        println("$num * $i = $product")
        i++


    }
}