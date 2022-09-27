package main.scala.org.my.comp.chapter02_structures_and_functions

import scala.collection.StringOps

object exercise_07 extends App{
  val myString: StringOps = "Hello"

  println(myString.map(_.toLong).product) //9415087488

}
