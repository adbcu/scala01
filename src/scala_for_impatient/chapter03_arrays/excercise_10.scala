package scala_for_impatient.chapter03_arrays
import java.awt.datatransfer._

object excercise_10 extends App {
  val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]

  flavors.getNativesForFlavor(DataFlavor.imageFlavor)

  println("pass")
}
