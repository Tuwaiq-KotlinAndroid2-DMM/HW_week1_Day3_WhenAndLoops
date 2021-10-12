import java.time.YearMonth
import java.util.*

var yearMonth: YearMonth? = null

fun main(args: Array<String>) {

    println("Enter the number of the month:")

    var monthNum: Int = Integer.valueOf(readLine())


    when (monthNum) {
        1 -> {
            yearMonth = YearMonth.of(Calendar.YEAR, 1)
        }
        2 -> {
            yearMonth = YearMonth.of(Calendar.YEAR, 2)
        }
        3 -> {
            yearMonth = YearMonth.of(Calendar.YEAR, 3)
        }
        4 -> {
            yearMonth = YearMonth.of(Calendar.YEAR, 4)
        }
        5 -> {
            yearMonth = YearMonth.of(Calendar.YEAR, 5)
        }
        6 -> {
            yearMonth = YearMonth.of(Calendar.YEAR, 6)
        }
        7 -> {
            yearMonth = YearMonth.of(Calendar.YEAR, 7)
        }
        8 -> {
            yearMonth = YearMonth.of(Calendar.YEAR, 8)
        }
        9 -> {
            yearMonth = YearMonth.of(Calendar.YEAR, 9)
        }
        10 -> {
            yearMonth = YearMonth.of(Calendar.YEAR, 10)
        }
        11 -> {
            yearMonth = YearMonth.of(Calendar.YEAR, 11)
        }
        12 -> {
            yearMonth = YearMonth.of(Calendar.YEAR, 12)
        }
        else -> {
            print("You ave entered a wrong number.\nPlease enter number between 1 and 12")
        }
    }

    if (yearMonth != null) {
        var daysInMonth = yearMonth?.lengthOfMonth()
        print("***************\n${yearMonth?.month} has $daysInMonth\n***************")
    }
}