package scala_for_impatient.chapter02_structures_and_functions

object exercise_05 extends App{
  def countdown(n: Int) = {
    var m = n
    while (m >= 0 ) {
      println(m)
      m -= 1
    }
  }

  countdown(5)
}

