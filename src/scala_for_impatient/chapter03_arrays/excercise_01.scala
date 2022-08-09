package scala_for_impatient.chapter03_arrays

import scala.collection.mutable.ArrayBuffer
import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

object excercise_01 extends App {
  //  var arr = new Array[Int](5)
  //  var arr2 = Array(5)

  def createArray(n: Int): Array[Int] = {

    val a = ArrayBuffer[Int]()
    a.addAll(0 until n).toArray

  }

    assert(createArray(3) sameElements Array[Int](0, 1, 2))

}
