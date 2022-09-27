package main.scala.org.my.comp.chapter02_structures_and_functions

import scala.runtime.Nothing$

object exercise_09 extends App {
  def product_recursive(s: String): Long = {
    var result: Long = 1
    if (s.tail.nonEmpty) {
      result  = s.head.toLong * product_recursive(s.tail)
    }
    else {
      result  = s.head.toLong
    }
//    println(s"After head: ${s.head}, head_long: ${s.head.toLong}, " +
//            s"tail: ${s.tail}, tail_long: ${s.tail.toLong} ")
    result
  }

  //    var result: Long = 1
  //
  //    while (true) {
  ////      result = product_recursive(s.charAt(x).toLong)
  //    }
  //    result
  //  }

  println(product_recursive("Hello")) //9415087488
}
