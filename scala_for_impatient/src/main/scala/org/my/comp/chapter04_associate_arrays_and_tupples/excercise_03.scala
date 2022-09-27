package main.scala.org.my.comp.chapter04_associate_arrays_and_tupples

import scala.collection.immutable._
import scala.io.Source

object excercise_03 extends App {
  val sourceFile = Source.fromFile("C:\\Users\\epotseluev\\IdeaProjects\\scala01\\src\\scala_for_impatient\\chapter04_associate_arrays_and_tupples\\myfile.txt")
  var dictionary = new HashMap[String, Int]

  val words = sourceFile.getLines().toString().split(" ")
  val array = for (word <- words) yield word
  print(array.count(_))

  for (word <- words )   yield {
//    println(word.toString)
//    (word, _ + 1 )
  }

}
