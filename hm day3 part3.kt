fun main() {
    var nums = arrayOf(1, 5, 10, 15, 25)

    var odd = 0

    for (y: Int in 0 until 5) {

        if (y % 2 != 0) {
            odd = y
            println(nums[y])
        }

    }

}








