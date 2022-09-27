package main.scala.org.my.comp.chapter04_associate_arrays_and_tupples

object excercise_01 extends App {
  val myMap = Map("Car" -> 1000,
    "Flat" -> 5000)

  val myNewMap = for ((k, v) <- myMap) yield {
    (k, v * 1.1)
  }

  println(myNewMap.mkString)


}
