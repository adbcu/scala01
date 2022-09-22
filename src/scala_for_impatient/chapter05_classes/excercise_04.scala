package scala_for_impatient.chapter05_classes

object excercise_04 extends App {
  class Time(val hours: Int = 0, val minutes: Int = 0) {
    private val totalMinutes = 60 * hours + minutes

    def before(other: Time): Boolean = {

      if (this.totalMinutes < other.totalMinutes) true
      else false
    }
  }

  val time1 = new Time(23, 59)
  println(
    time1.before(new Time(23, 40)
    )
  )
}
