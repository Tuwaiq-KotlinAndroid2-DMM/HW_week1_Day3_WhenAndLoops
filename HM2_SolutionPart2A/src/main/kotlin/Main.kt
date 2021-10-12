fun main() {

    println("Please enter a number: ")
    var n = Integer.valueOf(readLine())
    var i = 1
    var result = 1
    while (true) {
        result=n*i
        println("$n * $i = " + result)
        i++
        if(i>10) break
    }
}