package scala_for_impatient.chapter06_objects

// TODO:  
object excercise_06 {

  object cards extends Enumeration {
    val heart, diamond, club, spade = Value
//    val heart = Value(name = "h", i = 1)
//    val diamond = Value(name = "d")
//    val Yellow = Value
    
//    val heart = Value( '\u2665'.toString)
//    val diamond = Value ('\u2666'.toString)
//    val club = Value

//    override def toString(): String = {
//      if cards.withName()
//    }
  }

  object weekdays extends Enumeration {
    val monday, tuesday, wednesday, thirsday, friday, saturday, sunday = Value 
  }

}

import scala_for_impatient.chapter06_objects.excercise_06.cards
import scala_for_impatient.chapter06_objects.excercise_06.weekdays

object my extends App {

  println(s"cards.toString() = ${cards.toString()}")
  println(s"cards.diamond = ${cards.diamond.toString}")
  
  
//  println(s"excercise_06.cards.heart = ${excercise_06.cards.heart}")
//  println(s"excercise_06.cards.diamond = ${excercise_06.cards.diamond}")
//  println(s"cards.heart = ${cards.heart}")
//  println(s"cards.Yellow = ${cards(3)}")
//  println(s"cards.values = ${cards.values}")
////  println(s"cards.ValueSet.toString = ${cards.ValueSet.toString}")
//
//  println(s"weekdays.thirsday = ${weekdays.thirsday}")
//
//  for (day <- weekdays.values) println(day)
  
}



//  val heart1 = Value(name = "heart_icon", i = 0)
//  val diamond1 = Value(name = "diamond_icon", i = 1)

//  override def toString(): String = {
//    println("sdsd")
//    if (excercise_06 == "heart1") {
//      println("dfdfdfaaaa")
////      heart1.toString
//    }
//    else "dummy"
//    "s"
//  }


//  println(s"heart = ${heart}")





//  println(excercise_06.toString())
//  println(excercise_06.diamond1.toString)
//  println(excercise_06.diamond1)
//  println(s"excercise_06.club = ${excercise_06.club}")
//  println(s"excercise_06.toString() = ${excercise_06.toString()}")
//  println('\uD83C')
