package scala_for_impatient.chapter04_associate_arrays_and_tupples

object excercise_08 extends App {
  def minmax(values: Array[Int]): Tuple2[Int, Int] = {

    val min = values.min
    val max = values.max

    (values.min, values.max)

//    for (elem <- values) yield {
//      if (elem < min_elem ) min_elem = elem
//      else if
//    }
  }


  assert(minmax(Array[Int](1,4,6,5,6,5,4,8,6,5)) == (1,8))
}
