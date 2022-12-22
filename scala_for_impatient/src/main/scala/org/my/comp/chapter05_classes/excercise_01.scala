package scala.org.my.comp.chapter05_classes

object excercise_01 extends App {
  class Counter {

    private var value = 0

    def increment(): Unit = {
      if ( current() != Int.MaxValue ) value += 1
    }

    def current(): Int = value
  }

  val myCounter = new Counter()
  myCounter.increment()
}
