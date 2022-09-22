package scala_for_impatient.chapter06_objects

object excercies_03 extends App{
  object Origin extends java.awt.Point

  val pointOrigin1 = Origin
  pointOrigin1.setLocation(1, 2)
  println(s"pointOrigin1.getLocation = ${pointOrigin1.getLocation}")
  
  //todo  хз почему это плозая идея. Наверно потому что объект - синглтон, статический
  
  val pointOrigin2 = Origin
  pointOrigin2.setLocation(4,5)
  println(s"pointOrigin2.getLocation = ${pointOrigin2.getLocation}")
  println(s"pointOrigin1.getLocation = ${pointOrigin1.getLocation}")
}
