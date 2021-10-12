fun main() {
println("Enter the number of the month : ")

    var month=Integer.valueOf(readLine())
    println("*************************")

    when(month){
        1-> println("january has 31 days")
        2-> println("febraury has 29 days")
        3-> println("march has 31 days")
        4-> println("april  has 30 days")
        5-> println("may has 31 days")
        6-> println("june has 30 days")
        7-> println("july has 31 days")
        8-> println("august has 31 days")
        9-> println("september has 30 days")
        10-> println("october has 31 days")
        11-> println("november has 30 days")
        12-> println("december has 31 days")
        else-> println("there is no month for this number")
    }
    println("*************************")

}