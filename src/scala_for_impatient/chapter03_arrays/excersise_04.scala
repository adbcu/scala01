package scala_for_impatient.chapter03_arrays

object excersise_04 extends App {
  val a = Array(-1, -2, -5, 1, 2, -6, -2, 7, 8, 0)

  val positiveValues = (for (elem <- a if elem > 0) yield elem)
  val negativeValues = (for (elem <- a if elem <= 0) yield elem)

  //  println(positiveValues.mkString)
  //  println(negativeValues.mkString)

  val result = positiveValues.appendedAll(negativeValues)
  println(result.mkString)

}
