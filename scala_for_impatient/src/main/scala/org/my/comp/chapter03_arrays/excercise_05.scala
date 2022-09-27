package main.scala.org.my.comp.chapter03_arrays

object excercise_05 extends App {

  def averageArray(arr: Array[Double]): Double = {
    var result: Double = 0
    var sum: Double = 0
    for (elem <- arr if arr.length > 0) {
      sum += elem
//      println(s"sum = ${sum}")
//      println(s"elem = ${elem}")
    }
    sum / arr.length

  }

  assert(averageArray(Array(1, 2, 3)) == 2)
}
