fun main() {
	print("Please enter a positive number\n> ")
	val userInput = Integer.valueOf(readLine())

	for (multiplier in 1..10) {
		println("$userInput x $multiplier = " + userInput * multiplier)
	}
}