import scala.collection.StringOps

val myString: StringOps = "Hello"
myString.map(_.toInt).product

val myString: String = "Hello"
myString.head
myString.tail

myString.dropWhile(_>)