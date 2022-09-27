package main.scala.org.my.comp.chapter05_classes

object excercise_03 extends App {
  class Time(val hours: Int = 0, val minutes: Int = 0) {

    def before(other: Time): Boolean = {
      if (this.hours < other.hours) true
      else if (this.hours == other.hours && this.minutes < other.minutes) true
      else false
    }
  }

  val time1 = new Time(22, 59)
  println(
    time1.before(new Time(23, 40)
    )
  )
}
