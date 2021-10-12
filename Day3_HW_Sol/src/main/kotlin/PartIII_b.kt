fun main() {
    var positiveCounter = 0
    var negativeCounter = 0
    var zeroCounter = 0
    println("Enter as many number as you want. if you wish to stop, enter 00:")

    while (true){
        var input = readLine()
        if (input != null) {
            if (input == "00"){
                break
            }else if (input.toInt() > 0){
                positiveCounter++
            }else if (input.toInt() < 0){
                negativeCounter++
            }else{
                zeroCounter++
            }
        }
    }
    println("The total count for:")
    println("Positive numbers is $positiveCounter")
    println("Negative number is $negativeCounter")
    println("Zeros is $zeroCounter")
}
