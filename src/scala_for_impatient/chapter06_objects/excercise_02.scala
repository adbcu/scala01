package scala_for_impatient.chapter06_objects

object excercise_02 extends App {
  abstract class UnitConversion {
    def convert(value: Double): Double
  }

  object InchesToCentimeters extends UnitConversion {
    override def convert(value: Double): Double = value * 2.54
  }

  object MilesToKilometers extends UnitConversion {
    override def convert(miles: Double): Double = miles * 0.621
  }

  class UnitConversion2() {}

  object MilesToKilometers2 extends UnitConversion2() {
    def apply(miles: Double): Double = { miles * 0.621 }
  }

  object InchesToCentimeters2 extends UnitConversion2() {
    def apply(inches: Double): Double = { inches * 2.54 }

  }

  println(s"InchesToCentimeters = ${InchesToCentimeters.convert(1)}")
  println(s"milesToKilometers = ${MilesToKilometers.convert(1)}")
  println(s"MilesToKilometers2 = ${MilesToKilometers2(1)}")
  println(s"InchesToCentimeters2() = ${InchesToCentimeters2(1)}")
}
