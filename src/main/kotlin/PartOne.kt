fun main() {
	print("Please enter the month's number\n> ")
	val userInput = Integer.valueOf(readLine())
	val months = arrayOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
	val month = months[userInput - 1]
	var numberOfDays = 0

	numberOfDays = when (userInput) {
		1, 3, 5, 7, 8, 10, 12 -> 31
		2 -> 28
		else -> 30
	}

	println("There are $numberOfDays number of days in the month of $month")
}