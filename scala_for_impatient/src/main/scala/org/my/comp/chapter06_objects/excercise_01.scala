package main.scala.org.my.comp.chapter06_objects

object excercise_01 extends App {
  object Conversions {
    def inchesToCentimeters(inches: Double): Double = {
      inches * 2.54
    }


    def gallonsToLiters(gallons: Double): Double = {
      gallons * 3.785
    }

    def milesToKilometers(miles: Double): Double = miles * 0.621

    def milesToKilometers(miles: Int): Double = (miles * 0.621)
  }

  //

  object Accounts {
    private var lastNumber = 0

    def newUniqueNumber = {
      lastNumber += 1; lastNumber
    }
  }

  println(s"Accounts.newUniqueNumber = ${Accounts.newUniqueNumber}") //1
  println(s"Accounts.newUniqueNumber = ${Accounts.newUniqueNumber}") //2
  println(s"Accounts.newUniqueNumber = ${Accounts.newUniqueNumber}") //3
  println(s"Accounts.newUniqueNumber = ${Accounts.newUniqueNumber}") //4
  println(s"Accounts.newUniqueNumber = ${Accounts.newUniqueNumber}") //5


  
  assert(Conversions.gallonsToLiters(2) == 7.57)
  println(s"Conversions.gallonsToLiters(2) = ${Conversions.gallonsToLiters(2)}")
  assert(Conversions.gallonsToLiters(2.0) == 7.57)
  println(s"Conversions.gallonsToLiters(2.0) = ${Conversions.gallonsToLiters(2.0)}")

}
