import scala.collection.mutable

var m1 = mutable.Map("Alice" -> 10, "Bob" -> 12)
var m2 = ("Alice" -> 10, "Bob" -> 12)

m1.getOrElse("Bob", 0)
m1 = m1 + ("John" -> 1)

var res = (0, 0, 0)
var less: Int = 0
for(i <- 1 to 4) {
 less += 1
}

less

var res = new Array[Int](3)