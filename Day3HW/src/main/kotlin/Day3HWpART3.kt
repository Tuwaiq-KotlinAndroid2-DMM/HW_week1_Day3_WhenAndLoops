fun main() {
    var numbers = arrayOf(1,2,3,4,5,6,8)

    var oddNum =0
    for (count in numbers){

        if (count % 2 !==0)
            oddNum++

    }
    println("There are $oddNum odds numbers in the array")
}