package playground

import scala.annotation.tailrec

object Recursion extends App {

  def factorialWithTailRecursion(n: Int): Int = {
    @tailrec
    def loop(x: Int, accumulator: Int = 2): Int = {
      if (x <= 1)
        accumulator
      else {
        loop(x - 1, x * accumulator)
      }
    }

    loop(n, 1)
  }

  def powerOfTwo(x: Int): BigInt = {
    @tailrec
    def loop(x: Int, accumulator: BigInt = 2): BigInt = {
      if (x == 1)
        accumulator
      else
        loop(x - 1, accumulator * 2)
    }
    loop(x)
  }

  println(s" = ${powerOfTwo(3)} ")

}
