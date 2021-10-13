fun main() {
    val number = arrayOf(55, 44, 55, 96, 68, 77, 77)
    var odd = 0

    for (x in number) {
        if (x % 2 != 0) {
            odd ++
        }
    }
    println("There are " + odd + " odd numbers in the array")
}

