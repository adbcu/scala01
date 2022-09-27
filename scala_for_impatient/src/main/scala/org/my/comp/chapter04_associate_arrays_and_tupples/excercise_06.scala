package main.scala.org.my.comp.chapter04_associate_arrays_and_tupples

import java.util.Calendar
//import scala.collection.mutable
//import scala.collection.{immutable, mutable}
//import scala.collection.immutable.LinkedHashMap


object excercise_06 extends App {

  //  val calendar =  java.util.Calendar.getInstance().

  val daysOfWeek = scala.collection.mutable.LinkedHashMap(
    "Monday" -> Calendar.MONDAY,
    "Tuesday" -> Calendar.THURSDAY,
    "Wednesday" -> Calendar.WEDNESDAY,
    "Thursday" -> Calendar.THURSDAY,
    "Friday" -> Calendar.FRIDAY,
    "Saturday" -> Calendar.SATURDAY,
    "Sunday" -> Calendar.SUNDAY)

  for (day  <- daysOfWeek) println(day)

}

