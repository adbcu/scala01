package scala_for_impatient.chapter04_associate_arrays_and_tupples

object excercise_09 extends App {
  def iteqget(values: Array[Int], v: Int): (Int, Int, Int) = {
    var res = new Array[Int](3)

    for (elem <- values) {
      if (elem < v) {
        res(0) += 1; println(s"res(0) = ${res(0)} - elem = $elem")
      }
      else if (elem == v) {
        res(1) += 1; println(s"res(1) = ${res(1)} - elem = $elem")
      }
      else {
        res(2) += 1; println(s"res(2) = ${res(2)} - elem = $elem")
      }
    }
    (res(0), res(1), res(2))
  }

  val testArray: Array[Int] = Array(1, 4, 3, 2, 6, 8, 5, 6, 4, 3)
  iteqget(testArray, 4)

  assert(iteqget(testArray, 4) == (4, 2, 4))
}
