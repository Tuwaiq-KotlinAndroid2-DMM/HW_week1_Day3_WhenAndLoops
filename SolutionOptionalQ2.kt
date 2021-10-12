fun main(){
    //println("How many number you want to enter: ")
    //var num = Integer.valueOf(readLine())
    println("Enter the numbers: ")
    var startEntered = 0
    var counterp = 0
    var countern = 0
    var counterz = 0
    var positiveNum = 0
    var negativeNum =0
    var zeroNum = 0

    while(startEntered != -1)
    {
         startEntered = Integer.valueOf(readLine())

        if(startEntered > 0 ){
            counterp++
            positiveNum = counterp
        }else if(startEntered < 0 ){
        countern++
            negativeNum = countern
    }else {
            counterz++
            zeroNum = counterz
        }
    }
    println("The number of positive number is: $positiveNum")
    println("The number of negative number is: $negativeNum")
    println("The number of zero number is: $zeroNum")

}