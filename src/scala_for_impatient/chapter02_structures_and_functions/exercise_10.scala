package scala_for_impatient.chapter02_structures_and_functions
//import org.scalatest._

import scala.runtime.RichInt
import math.pow

object exercise_10 extends App {

  assert(powerFunc(2, 6) == 64) //1
  assert(powerFunc(3, 3) == 27) //27
  assert(powerFunc(5, 0) == 1) //1
  assert(powerFunc(1, -2) == 1) //1


  def powerFunc(x: Int, n: Int): Double = {
    var res: Double = 1

    if (n % 2 == 0 && n > 0) {
      val y = pow(x, n / 2)
      pow(y, 2)
    }
    else if (n % 2 == 1 && n > 0) {
      x * pow(x, n - 1)
    }
    else if (n == 0) {
      1
    }
    else if (n < 0) {
      println(1 / pow(x, -n))
      1 / pow(x, -n)
    }
    else throw new UnsupportedOperationException("Unsopported")
  }


}


