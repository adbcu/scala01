package scala_for_impatient.chapter02_structures_and_functions

object exercise_01 extends App{

  def signum(n: Int): Int = {
    if (n > 0) 1
    else if (n < 0) -1
    else 0
  }

  println(signum(10))
  println(signum(-10))
  println(signum(0))


}