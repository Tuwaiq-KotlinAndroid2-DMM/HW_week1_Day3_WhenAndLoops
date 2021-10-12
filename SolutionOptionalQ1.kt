fun main(){
    println("Enter numbers to reversed: ")
    var num = Integer.valueOf(readLine())
    var x = 0
    while(num != 0){
        var y = num%10
        x = x * 10 +y
        num /= 10
    }
    println("Reversed Number: $x")
}