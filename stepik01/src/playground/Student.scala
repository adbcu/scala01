package playground

import playground.Grade.{FIRST, UNKNOWN_GRADUATE, UNKNOWN_LETTER}

class Grade(val graduate: Int, val letter: String) {
  def this() = this(graduate = UNKNOWN_GRADUATE, letter = UNKNOWN_LETTER)
}

object Grade {
  val SCHOOL_NAME = "Школа на проспекте Вернадского"

  val UNKNOWN_GRADUATE = 0
  val UNKNOWN_LETTER = "N/A"

  val FIRST: Int = 1
  val LETTER_A: String = "A"

  val SESOND: Int = 2
  val LETTER_B: String = "B"
}

class Student(val name: String, val age: Int, val grade: Grade) {
//   def this() = this("Unknown person", 0)

  def printInfo(): Unit = {
    println(s"${this.name} учится в ${grade.graduate}${grade.letter}")

  }
}

object Student {

}

class Person(val gender: String) {

}

object Run extends App {

  val grade_1A: Grade = new Grade(graduate = 1, letter = "A")
  val grade_1B: Grade = new Grade(graduate = 1, letter = "B")

  val student1 = new Student(name = "Алиса", age = 7, grade = grade_1A)
  student1.printInfo

  val student2 = new Student(name = "Артем", age = 8, grade = grade_1B)
  student2.printInfo

}