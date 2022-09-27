package main.scala.org.my.comp.chapter05_classes

object excercise_08 extends App {
  class Car(val brand: String, val model: String) {
    var year: Int = -1
    var registryNumber: String = ""

    def this(brand: String, model: String, year: Int, registryNumber: String) = {
      this(brand, model)
      this.year = year
      this.registryNumber = registryNumber
    }

    def this(brand: String, model: String, year: Int) = {
      this(brand, model)
      this.year = year
    }

    def this(brand: String, model: String, registryNumber: String) = {
      this(brand, model)
      this.registryNumber = registryNumber
    }

  }

  val x_trail = new Car(brand = "Nissan", model = "X-Trail")
  val fabia = new Car(brand = "Skoda", model = "Fabia", year = 2002, registryNumber = "A444OO77")
  val focus = new Car(brand = "Ford", model = "Focus", year = 2005)
  val civic = new Car(brand = "Honda", model = "Civik", registryNumber = "KK123TT777")


}
