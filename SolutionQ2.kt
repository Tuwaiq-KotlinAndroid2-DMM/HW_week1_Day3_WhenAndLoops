fun main(){
    println("Enter number to show tha multiblication table: ")
    var n = Integer.valueOf(readLine())
    var counter = 1
    while (n != 0 && counter <= 10){
        var total = n*counter

        println("$n * $counter = $total")
        counter++
    }
}