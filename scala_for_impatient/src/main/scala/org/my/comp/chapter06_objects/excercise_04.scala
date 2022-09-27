package main.scala.org.my.comp.chapter06_objects

object excercise_04 extends App {
  class Point(var x: Int, val y: Int) {

//    def x_=(newValueX: Int) { x = newValueX}
//    def y_=(newValueY: Int) { x = newValueY}

//    var _x: Int = x
//    var _y: Int = y
  }

  object Point {
    def apply(x: Int, y: Int): Point = {
      new Point(x,y)
//      _x = x
//      _y = y
    }
  }

  val p1 = Point(3, 4)
  p1.x = 23
  println(s"p1.x = ${p1.x}")
  println(s"p1.y = ${p1.y}")
}
