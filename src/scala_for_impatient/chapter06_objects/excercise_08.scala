package scala_for_impatient.chapter06_objects

object excercise_08 extends App{

  object RGB extends Enumeration {

    val red =     Value("#ff0000")
    val blue =    Value("#0000ff")
    val lime =    Value("#00ff00")
    val fuchsia = Value("#ff00ff")
    val yellow =  Value("#ffff00")
    val white =   Value("#ffffff")
    val aqua =    Value("#00ffff")
    val black =   Value("#000000")
  }

  println(s"RGB.values = ${RGB.values}")
  println(s"RGB.red = ${RGB.red}")

  assert(RGB.red.toString == "#ff0000")
  

}

import scala_for_impatient.chapter06_objects.excercise_08.RGB._
//object myApp extends App{
//  
//}
