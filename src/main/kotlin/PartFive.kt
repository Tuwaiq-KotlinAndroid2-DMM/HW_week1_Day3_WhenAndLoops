fun main() {
	print("How many numbers do you wish to enter?\n> ")
	val noOfNumbersToEnter = Integer.valueOf(readLine())
	var counter = 0
	var zeros = 0
	var positiveNumbers = 0
	var negativeNumbers = 0

	for (number in 1..noOfNumbersToEnter) {
		print("Enter number #$number\n> ")
		val userInput = Integer.valueOf(readLine())
		if (userInput > 0) {
			positiveNumbers ++
		} else if (userInput < 0 ) {
			negativeNumbers ++
		} else {
			zeros ++
		}
	}

	println("There are $positiveNumbers positive numbers, $negativeNumbers negative numbers and $zeros zeros.")
}