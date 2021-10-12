fun main() {
    // Integer multiplication
    println("Input a positive integer")
    var n = Integer.valueOf(readLine())
    var counter = 0

    if (n>0){
        while (counter<=10){
            var m = n*counter
            println("$n * $counter = $m")
            counter ++
        }
    }else{
        println("Please enter a positive integer")
    }

}