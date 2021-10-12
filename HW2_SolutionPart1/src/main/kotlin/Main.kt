fun main() {
    println("Please enter a month number:")

    var month = Integer.valueOf(readLine())
    when (month) { //when is like a switch
        1 -> println("January \n********************\nJanuary has 31 days\n********************")
        2 -> println("February \n********************\nFebruary has 28 days\n********************")
        3 -> println("March \n********************\nMarch has 31 days\n********************")
        4 -> println("April \n********************\nApril has 30 days\n********************")
        5 -> println("May \n********************\nMay has 31 days\n********************")
        6 -> println("June \n********************\nJune has 30 days\n********************")
        7 -> println("July \n********************\nJuly has 31 days\n********************")
        8 -> println("August \n********************\nAugust has 31 days\n********************")
        9 -> println("September \n********************\nSeptember has 31 days\n********************")
        10 -> println("October \n********************\nOctober has 31 days\n********************")
        11 -> println("November \n********************\nNovember has 30 days\n********************")
        12 -> println("December \n********************\nDecember has 31 days\n********************")
        else -> println("Invalid Month")
    }

}