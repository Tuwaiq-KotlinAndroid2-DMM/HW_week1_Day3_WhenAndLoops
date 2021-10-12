fun main() {
    println("Please Enter a number: ")
    var num = Integer.valueOf(readLine())
    var counter = 1
    while (num > 0){
        println("$num * $counter = " + (num*counter))
        counter++
        if (counter >10)
            break
    }
}