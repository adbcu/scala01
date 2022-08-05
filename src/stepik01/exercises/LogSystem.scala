package stepik01.exercises

object LogSystem {
  def main(args: Array[String]): Unit = {

  }

  class Logger(val msgNum: Int = 0) {
    def info: Logger = {
      println("INFO New Message")
      new Logger(msgNum + 1)
    }

    def info(n: Int): Logger = {
      if (n <= 0) this
      else info.info(n - 1)
    }

    def print: Unit = {
      println(msgNum)
    }
  }

}
