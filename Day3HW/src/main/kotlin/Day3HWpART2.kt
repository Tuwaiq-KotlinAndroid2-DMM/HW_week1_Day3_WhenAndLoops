fun main() {

    println("Please enter the number : ")
    var number =Integer.valueOf(readLine())

    var count = 1
    count
    while (count<=10){
        println(""+number +" * "+count+" = "+number*count)
        count++
    }
}