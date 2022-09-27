package main.scala.org.my.comp.chapter04_associate_arrays_and_tupples

import scala.collection.{immutable, mutable}
import scala.jdk.CollectionConverters._

object excercise_07 extends App {

  val properties: mutable.Map[String, String] = System.getProperties().asScala

  val arr = properties.toMap
  val maxKeybByLength: String = arr.keysIterator.maxByOption(_.length).getOrElse("")
//  val maxLength: Int =

  for ((k, v) <- arr) yield {
//    println(s"key = ${k}, maxlength = $maxLength, k.length = ${k.length} , ${( maxLength - k.length)}")
        println(s"${k}" + (" " * ( maxKeybByLength.length - k.length) + "|" + s" ${v}"))
  }
}
