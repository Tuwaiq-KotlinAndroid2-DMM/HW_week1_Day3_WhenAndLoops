fun main() {

    println("Please enter a positive number")

    var num = Integer.valueOf(readLine())
    var counter =1

    while (counter<= 10){
        var total = num * counter
        if (num>=0){
            println("$num * $counter = $total")

        }

        counter++

    }

}


