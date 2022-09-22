package scala_for_impatient.chapter05_classes

object excercise_07 extends App {
  class Person(fullName: String) {
    //    println("Create Person")
    //    println(s"fullName = ${fullName}")
    //    println(s"this.fullName = ${this.fullName}")

    def firstName: String = fullName.split(" ")(0)

    def lastName: String = fullName.split(" ")(1)

    //    println(s"firstname = ${firstName}")
    //    println(s"lastName = ${lastName}")

  }

  //  val person = new Person("Boris Johnson")
  //    person.fullName = "dfdf"

  //  println(s"person.firstName = ${person.firstName}")
  //  println(s"person.lastName = ${person.lastName}")

  //  person.fullName = "dfdf"
  //  println(s"person.fullName = ${person.fullName}")
  println("End")

  assert(new Person("Boris TheBlade").lastName == "TheBlade")

}
