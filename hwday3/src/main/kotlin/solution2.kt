fun main() {
    println("enter positive number :")
    var num = Integer.valueOf(readLine())
    var counter = 1

    while (num > 0){
        var total= num * counter
        println(" $num * $counter =  $total" )
        counter ++
        if (counter > 10)
            break;
    }
}