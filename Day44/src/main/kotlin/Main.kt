fun main() {
    var age = arrayOf(22,34,56,32,45)
    var m= age.minOrNull()
    var mx =age.maxOrNull()

    println(m)
    println("Oldest ome is : "+mx)

    var newAge = age.clone()
    age.sort()
   // println(age.sort())
  for (x in age){
      println(x)
  }
    age.sortDescending()
    for (y in age){
        println("sortDescending " +y)
    }
}