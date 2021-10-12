package com.includehelp.basic

import java.util.*

fun getReverse(number: Int): Int {
    var number = number
    var sum = 0

    while (number > 0) {
        val r = number % 10
        sum = sum * 10 + r
        number /= 10
    }
    return sum
}


fun main(arg: Array<String>) {
    val sc = Scanner(System.`in`)


    println("Enter Number  : ")
    val num: Int = sc.nextInt()


    val reverseNumber = getReverse(num)


    println("Reverse Number : $reverseNumber")
}