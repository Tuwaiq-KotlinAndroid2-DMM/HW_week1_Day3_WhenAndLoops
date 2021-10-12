fun main() {
    println("How many number you want to enter?")
    var choice = Integer.valueOf(readLine())
    var counter = 1
    var positives = 0
    var negatives = 0
    var zeros = 0
    while (choice > 0){
        print("Enter number #$counter: ")
        var number = Integer.valueOf(readLine())
        if (number > 0) {
            positives++
        }
        else if (number < 0) {
            negatives++
        }
        else {
            zeros++
        }
        counter++
        choice--
    }
    println("\nCount of positive: $positives\n" +
            "Count of negativ: $negatives\n" +
            "Count of zeros: $zeros")
}