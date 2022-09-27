package stepik01.week3_oop

object CaseClasses {
  def main(args: Array[String]): Unit = {

  }

  case class Person(name: String, age: Int)

  val bob = new Person(name = "Bob", age = 12)
  println(bob.toString)

  val steve = bob.copy(name = "Steve", age = bob.age + 1)
  println(steve.toString)

  println(bob.hashCode())
  println(steve.hashCode())
  println(bob == steve)


  object A {
    val a: String = "value a"
    println("object A")
  }

  val aVal = A
  val anotherVal = A

  println(aVal.a)
  println(anotherVal.a)
}
