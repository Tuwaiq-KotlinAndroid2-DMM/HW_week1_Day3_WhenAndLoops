fun main(args: Array<String>) {

    println("Please, enter a positive number:")

    var num: Int = Integer.valueOf(readLine())

    for (i in 1..10){

        println("$num * $i = "+ i * num)

    }
}