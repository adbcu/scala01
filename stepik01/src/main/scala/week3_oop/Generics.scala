package stepik01.week3_oop



object Generics {

  def main(args: Array[String]) = {
    //    println("Hel3.3 Наследованиеlo, world")
  }

  class MyList[B]

  val IntList = new MyList[Int]
  val DoubleList = new MyList[Double]

  print("Hello")

  def randomInt[A](items: List[A]): A = {
    val randomIndex = util.Random.nextInt(items.length)
    items(randomIndex)
  }

  println(randomInt(List(1, 2, 3, 4, 5)))


  class Fruit
  class Banana extends Fruit
  class Apple extends Fruit

  class Invr[+A]

  val inv: Invr[Fruit] = new Invr[Banana]

}
