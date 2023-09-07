package playground

object Main extends App {

  val grade_1A: Grade = new Grade(graduate = 1, letter = "A")
  val grade_1B: Grade = new Grade(graduate = 1, letter = "B")

  val student1 = new Student(name = "Алиса", age = 7, grade = grade_1A, "Девочка")
  student1.printInfo

  val student2 = new Student(name = "Артем", age = 8, grade = grade_1B, "Мальчик")
  student2.printInfo

  val student3 = new Person("Male")


}