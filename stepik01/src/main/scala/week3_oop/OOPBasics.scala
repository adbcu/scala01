package main.scala.week3_oop

class Student(val id: Int) {
  def this() = this(id = 0)
}

object Student {
  def apply(): Unit = {
    print(println(s"id = ${}"))
  }
}

object OOPBasics extends App {
  val student01 = new Student()
  println(s"student01.id = ${student01.id}")

  val student02 = new Student(id = 1)
  println(s"student02.id = ${student02.id}")
}