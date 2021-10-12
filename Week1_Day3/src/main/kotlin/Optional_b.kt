fun main() {
    println("How many number you want to enter:")
    var c =Integer.valueOf(readLine())
    var pos=0
    var neg=0
    var zero=0
    var i=1
    while (c > 0){
        println("Enter number #$i")
        var num = Integer.valueOf(readLine())
        if (num > 0){
            ++pos}
        else if (num < 0){
            ++neg
        }else{
            ++zero

        }
        ++i
        --c
    }
    println("Count of postive: $pos")
    println("Count of Negative: $neg")
    println("Count of zeros: $zero")



}