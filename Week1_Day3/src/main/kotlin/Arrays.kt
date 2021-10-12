fun main() {
    var array= arrayOf(28,3,6,5,7,8,9)
    var o=0
    for (a in array){
        if(a % 2 !=0 ){
            o++
        }
    }
    println("There are $o odds numbers in the array")
}