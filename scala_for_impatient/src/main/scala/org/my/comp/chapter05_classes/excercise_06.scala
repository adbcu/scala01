package main.scala.org.my.comp.chapter05_classes

object excercise_06 extends App {
  class Person(private var _age: Int = 0) {
    //    private var _age: Int = 0

    if (_age < 0) _age = 0

    def age: Int = _age

    def age_=(newValue: Int): Unit = {
      if (newValue > _age) _age = newValue

    }
  }

  assert(new Person(-10).age == 0)
}
