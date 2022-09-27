package main.scala.org.my.comp.chapter05_classes

object excercise_10 extends App {
  class Employee(val name: String, var salary: Double) {
    def this() {
      this(name = "John Q. Public", salary = 0.0)
    }
  }

  class Employee2(val name: String = "John Q. Public",
                  var salary: Double = 0.0) {
    def this() {
      this(name = "John Q. Public", salary = 0.0)
    }
  }

  val employee = new Employee()
  val employee2 = new Employee2(name = "Ivan", salary = 12)

  println(s"employee2.salary = ${employee2.salary}")
  employee2.salary = 10
  println(s" = ${employee2.salary}")
  
  val employee3 = new Employee2()
  println(s"employee3 = ${employee3}")

}
