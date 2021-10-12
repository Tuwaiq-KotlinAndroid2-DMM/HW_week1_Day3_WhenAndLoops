fun main() {
    println("Enter a number:")
    var num=Integer.valueOf(readLine())
    var i=1
    while (num>0){
          println("$i * $num =" +(num*i))
            i++
        if(i>10)break
        }

}