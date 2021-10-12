fun main() {
	print("Please enter a positive number\n> ")
	val userInput = Integer.valueOf(readLine())
	var copyOfUserInput = userInput

	var reversed = 0

	while (copyOfUserInput != 0) {
		val digit = copyOfUserInput % 10
		reversed = reversed * 10 + digit
		copyOfUserInput /= 10
	}

	println("The reverse number of $userInput is $reversed")
}