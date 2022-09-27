package main.scala.org.my.comp.chapter03_arrays

import scala.collection.mutable.ArrayBuffer
import scala.language.postfixOps

object excercise_06 extends App {
  var a = Array[Int](1, 2, 3, 4, 5)
  var b = ArrayBuffer[Int](1, 2, 3, 4, 5)

  def arrayReverse(a: Array[Int]): Array[Int] = {
    (for (index <- a.indices) yield a(a.length - index - 1)).toArray
  }

    assert(arrayReverse(a) sameElements a.reverse)

  def arrayBufferReverse(b: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    b.reverse
  }

  assert(arrayBufferReverse(b) sameElements b.reverse)

}
