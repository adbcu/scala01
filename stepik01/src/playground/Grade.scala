package playground

import playground.Grade.{UNKNOWN_GRADUATE, UNKNOWN_LETTER}

class Grade(val graduate: Int, val letter: String) {
  def this() = this(graduate = UNKNOWN_GRADUATE, letter = UNKNOWN_LETTER)
}

object Grade {
  val SCHOOL_NAME = "Школа на проспекте Вернадского"

  val UNKNOWN_GRADUATE = 0
  val UNKNOWN_LETTER = "N/A"

  val FIRST: Int = 1
  val LETTER_A: String = "A"

  val SESOND: Int = 2
  val LETTER_B: String = "B"
}
