fun main() {


    println("enter numbers" +
            "when you are done enter (Done)")
    var positive = 0
    var negative = 0
    var zero = 0
var exit = ""
    while (true) {
        var x = Integer.valueOf(readLine())
        if (x > 0) positive++
        if (x < 0) negative++
        if (x == 0) zero++

        // till the user wants.
        // because of this condition,
    // we need an infinite loop. so i couldn't think of a way to break the loop.

    }

    println(
        """
       Positive numbers: $positive
    negative numbers: $negative
        zeros numbers: $zero
 
    """.trimMargin()
    )

}