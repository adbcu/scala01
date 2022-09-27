package stepik01.week3fp

import scala.annotation.tailrec


object FunctionsFP {

  //==
  //  class Multiplication {
  //    def multiply(x: Int): Int = x * 2
  //  }
  //
  //  val m1 = new Multiplication().multiply(3)
  //  println(m1)
  //==
  //  trait Multiplication[A, B] {
  //    def apply(x: A): B
  //    println("Hello")
  //  }
  //
  //  val m = new Multiplication[Int, Double] {
  //    override def apply (x: Int): Double = x * 2
  //  }
  //  print(m(3))
  //==
  //  val res = new Function2[Int, Int, Int] {
  //    override def apply(v1: Int, v2: Int): Int = v1 * v2
  //  }
  //
  //  println(res(2, 3))
  //==
  //  val res1 = (x: Int, y: Int) => x * y
  //  val res2: (Int, Int) => Int = _ * _
  //  val res3: Int => Int = _ * 2
  //  val res4: (Int, Int) => Int = _ * _
  //  println(res1(2, 3))
  //  println(res2(2, 3))
  //  println(res3(3))
  //  val strlen = (s: String) => s.length
  //  println(strlen("Hello"))

  //==

  @tailrec
  def nTimes(f: Int => Int, x: Int, n: Int): Int = {
    if (n <= 0) x
    else nTimes(f, f(x), n - 1)
  }

  val increment = (x: Int) => x + 1

  println(nTimes(increment, 0, 3)) // выведет 3
  def main(args: Array[String]): Unit = {

  }


}
