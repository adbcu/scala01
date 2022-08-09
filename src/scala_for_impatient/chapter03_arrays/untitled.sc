import scala.collection.mutable.ArrayBuffer

val arr = Array[Int](10)
val arr2 = new Array[Int](3)

var arr3 = new ArrayBuffer[Int](5)
arr3.insert(0,6)
arr3 += (4,5)
arr3.head
arr3.tail
arr3.addOne(2)
arr3.remove(1,2)
arr3
arr3.sortInPlace()
arr3.prepend(3)
arr3.foreach(_ + 1)
val b = 3.seconds