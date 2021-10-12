fun main() {
	val arr = arrayOf(10, 32, 42, 64, 23, 32, 87, 11)
	var counter = 0

	for (number in arr) {
		if (number % 2 != 0) {
			counter ++
		}
	}

	println("There are $counter number of odd numbers in the array.")
}