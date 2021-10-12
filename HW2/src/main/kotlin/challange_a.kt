fun main() {
    println("Please enter a number to git them reversed")
    var num = Integer.valueOf(readLine())

    var arrStr = num.toString()
    var rev = arrStr.reversed()
    var final = rev.toInt()

    println(final)


    }
