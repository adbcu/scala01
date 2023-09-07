package playground

class Student(val name: String, val age: Int, val grade: Grade, gender: String) extends Person(gender) {
  //   def this() = this("Unknown person", 0)

  override def get_gender: String = s"Умный ${super.get_gender}"

  def printInfo(): Unit = {
    println(s"$get_gender ${this.name} учится в ${grade.graduate}${grade.letter}")

  }
}
