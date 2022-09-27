package main.scala.org.my.comp.chapter05_classes

import scala.beans.BeanProperty

object excercise_05 extends App {
  class Student(@BeanProperty var gender: String = "n/a") {

    @BeanProperty val name: String = ""
    @BeanProperty var id: Long = 0

  }

  val student = new Student("male")
  println(s"student.id = ${student.id}")
  student.id = 1
  println(s"student.id = ${student.id}")
  student.setId(2)
  println(s"student.id = ${student.id}")





}
