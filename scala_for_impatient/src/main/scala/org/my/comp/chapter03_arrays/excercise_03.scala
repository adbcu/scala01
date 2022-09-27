package main.scala.org.my.comp.chapter03_arrays

import scala.collection.mutable.ArrayBuffer

object excercise_03 extends App {
  val a = Array[Int](1, 2, 3, 4, 5)
  //
  //  val even = for (index <- a.indices if index % 2 == 0) yield a(index)
  //  val odd  = for ( index <- a.indices if index % 2 == 1 )  yield a(index)

  //  val result = even.zip(odd)
  //  println(result.mkString)
  //  println(even.mkString)
  //  println(odd.mkString)


  def changeArray(a: Array[Int]): Array[Int] = {
    val b: Array[Int] = (for (index <- 0 until a.length) yield {
      if (index % 2 == 0 && index != a.length - 1) {
        a(index + 1)
      }
      else if ((a(index) % 2 == 0)) {
        a(index) - 1
      }
      else a(index)
    }).toArray
    b
  }
//    println(b.mkString)


    assert(changeArray(a).sameElements(Array[Int](2, 1, 4, 3, 5)))

  }
