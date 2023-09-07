package playground

object ScalaPlayground extends App {
  // исправьте код

  def multiply(y: Int): Int = y * y

  def aCondition(): Boolean = if (1 > 2) true else false
  def someFunc(x: Int, y: Int): Unit = {
    if (aCondition) x * 3
    else multiply(y)
  }

  println(someFunc(3, multiply(4)))
}

