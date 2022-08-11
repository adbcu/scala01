package scala_for_impatient.chapter04_associate_arrays_and_tupples

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



//  var wordsCount = new scala.collection.immutable.HashMap[String, Int]

//  for (word <- words.distinct) wordsCount = wordsCount + (word -> words.count(_ == word))
//  for ((k, v) <- wordsCount) printf("Word %s contains %d times\n", k, v)


}
