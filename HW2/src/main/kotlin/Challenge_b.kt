fun main() {
    // Count of positive, negative and zero inputs
    println("How many numbers you want to enter:")
    var i = Integer.valueOf(readLine())
    println("Enter $i number:")
    var p = 0
    var n = 0
    var z = 0

    while (i>0) {
        var x = Integer.valueOf(readLine())
        if (x>0){
            p++
        }else if (x<0){
            n++
        }else if (x==0){
            z++
        }
    i--
    }
    println("The entered positive numbers are $p")
    println("The entered negative numbers are $n")
    println("The entered zero numbers are $z")

}