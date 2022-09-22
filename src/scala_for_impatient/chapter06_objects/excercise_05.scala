package scala_for_impatient.chapter06_objects

import scala.io.StdIn.readLine

object excercise_05 extends App{
  val a = args.toArray[String]
  // TODO: на потом 
  val arg = readLine();
  println(s"arg = ${arg}")
  println(s"args = ${args}")
}
