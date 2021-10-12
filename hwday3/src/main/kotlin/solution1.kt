fun main() {
    println("enter the number of the month :")
    var num = Integer.valueOf(readLine())

            when (num){
                1 -> println(" January has 31 days")
                2 -> println(" February has 28 days")
                3 -> println(" March has 31 days")
                4 -> println(" April has 30 days")
                5 -> println(" May has 31 days")
                6 -> println(" June has 30 days")
                7 -> println(" July has 31 days")
                8 -> println(" August has 31 days")
                9 -> println(" September has 30 days")
                10 -> println(" October has 31 days")
                11 -> println(" November has 30 days")
                12 -> println(" December has 31 days")

                else -> println(" Invalid Number")
            }

}