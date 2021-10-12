fun main() {
    var num = Integer.valueOf(readLine())
    var multiplication = 1
    var result = 0
    while (multiplication<=10) {
        if (num >0) {

            result = num * multiplication
            println("$num * $multiplication =  $result")
            multiplication++
        }
         else {
            println("this number is negative")
            break
        }
    }
}