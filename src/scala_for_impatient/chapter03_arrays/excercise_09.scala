package scala_for_impatient.chapter03_arrays

import scala.collection.mutable.ArrayBuffer

object excercise_09 extends App{

  val timeZones = java.util.TimeZone.getAvailableIDs()
      .filter(_.startsWith("America/")).sorted

}
