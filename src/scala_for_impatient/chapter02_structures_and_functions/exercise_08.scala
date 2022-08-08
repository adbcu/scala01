package scala_for_impatient.chapter02_structures_and_functions

object exercise_08 extends App{

  def product (s: String): Long = {
    var result: Long = 1
    for (x <- 0 until s.length) {
      result *= s.charAt(x).toLong
    }
    result
  }

  println(product("Hello")) //9415087488
}
