fun main() {
   println("Please enter a number ,if you want to quit the program please enter -1")
    // var num = arrayOf(1,2,3,-1,-2,0)
    var PositiveCount =0
    var NegativeCount =0
    var ZerosCount =0

    while (true){

        var num = Integer.valueOf(readLine())
        if (num < 0 ){
            PositiveCount ++
        }
        if (num > 0 ){
            NegativeCount ++
        }
        if (num == 0 ){
            ZerosCount ++
        }

        if (num == -1) break

    }
    println("Positive Number is: $PositiveCount")
    println("Negative Number is: $NegativeCount")
    println("Zeros Number is: $ZerosCount")

 /*
    for (i in num){

        if (i < 0 ){
            PositiveCount ++
        }
        if (i > 0 ){
            NegativeCount ++
        }
        if (i == 0 ){
            ZerosCount ++
        }
    }

  */

}