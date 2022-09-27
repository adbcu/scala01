package main.scala.org.my.comp.chapter02_structures_and_functions

object exercise_06 extends App {
  val myString = s"Hello"
  var result: Long = 1
  for (x <- 0 until myString.length) {
    result *= myString.charAt(x).toLong
  }
  println(result) //9415087488
}
