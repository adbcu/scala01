package main.scala.org.my.comp.chapter03_arrays

import scala.collection.mutable.ArrayBuffer

object excercise_07 extends App {
  val a = Array[Int](1, 2, 3, 4, 4, 5)

  def deleteDuplicates(a: Array[Int]) = {
    val b = ArrayBuffer[Int]().appendAll(a)
    b.distinct
  }

  assert(deleteDuplicates(a).sameElements(Array(1,2,3,4,5)))
}
