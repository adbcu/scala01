package main.scala.week3_oop

object CaseClasses {
  def main(args: Array[String]): Unit = {

  }

  case class Person(name: String, age: Int)

  val bob = new Person(name = "Bob", age = 12)
  println(bob.toString)

  private val steve = bob.copy(name = "Steve", age = bob.age + 1)
  println(steve.toString)

  println(bob.hashCode())
  println(steve.hashCode())
  println(bob == steve)


  object A {
    val a: String = "value a"
    println("object A")
  }

  private val aVal = A
  private val anotherVal = A

  println(aVal.a)
  println(anotherVal.a)
}
