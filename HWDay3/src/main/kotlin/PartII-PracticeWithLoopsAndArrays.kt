fun main() {
     println("Enter a positive number ")
    var n1 = Integer.valueOf(readLine())
    var x = 1
    if (n1 > 0){
        while (x <=10)
        {
            println("$n1 * $x =" )
            println(x*n1)
            x++
        }
    }
    else
    {
        println("You entered negative number")
    }
}