package main.scala.org.my.comp.chapter03_arrays

import scala.collection.mutable.ArrayBuffer

object excercise_02 extends App {
  val a = ArrayBuffer(1, 2, 3, 4, 5)


  def changeArray(a: ArrayBuffer[Int]) = {
    var b = ArrayBuffer[Int]()
    //  for (elem <- 0 to a.length) {
    for (indexElem <- a.indices by 2) {
//      println(s"index: ${indexElem} , elem: ${a(indexElem)}")
      if (indexElem == a.length - 1) {
        b.append(a.last)
      }
      else {
        b.appendAll(ArrayBuffer[Int](a(indexElem + 1), a(indexElem)))
      }
    }
    b
  }

  assert(changeArray(a).equals(ArrayBuffer[Int](2,1,4,3,5)))

}
