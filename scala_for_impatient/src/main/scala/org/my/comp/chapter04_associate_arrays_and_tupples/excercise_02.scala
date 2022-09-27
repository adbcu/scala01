package main.scala.org.my.comp.chapter04_associate_arrays_and_tupples

import java.io.File
import java.nio.file.FileSystem
import scala.collection.mutable
import scala.io.Source


object excercise_02 extends App {
  //  println(System.getProperty())

  //  println( new File("myfile.txt").getCanonicalPath )


  //  val in = new java.util.Scanner(new File("C:\\Users\\epotseluev\\IdeaProjects\\scala01\\src\\scala_for_impatient\\chapter04_associate_arrays_and_tupples","myfile.txt"))
  //  val in = new java.util.Scanner(new java.io.File("myfile.txt"))
  //  in.next()
  //  while (in.hasNext()) {
  //    println(in.source())
  //    in.next()
  //  }

  val sourceFile = Source.fromFile("C:\\Users\\epotseluev\\IdeaProjects\\scala01\\src\\scala_for_impatient\\chapter04_associate_arrays_and_tupples\\myfile.txt")
  //  println(in.mkString)
  var dictionary = mutable.Map[String, Int]()

  //  println(s"in.getLines() = ${sourceFile.getLines()}")

  for (line <- sourceFile.getLines()) {
    //    println(s"line = ${line}")

    for (word <- line.split(" ")) {
      //      println(s"word = ${word}")
      //      if (dictionary.getOrElse(word, 0) == 0) {
      //        dictionary += (word -> 1)
      //      }
      //      else dictionary(word) = dictionary(word) + 1

      dictionary(word) = dictionary.getOrElse(word, 0) + 1

    }

  }

  for ((k, v) <- dictionary) {
    println(s"${k}: ${v} times")
  }

  //
  //  }
}
