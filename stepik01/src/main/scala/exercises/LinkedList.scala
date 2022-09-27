package stepik01.exercises

object LinkedList {
  def main(args: Array[String]): Unit = {


  }

  abstract class LogList {

    def last: String

    def previous: LogList

    def isEmpty: Boolean

    def all: String

    def add(msg: String): LogList
  }

  class Log(head: String, tail: LogList) extends LogList {
    override def last: String = head

    override def previous: LogList = tail

    override def isEmpty: Boolean = { this == Empty}

    override def all: String = this.toString

    override def add(msg: String): LogList = new Log(msg, this)

    override def toString: String = s"${head} ${tail}"
  }

  object Empty extends LogList {
    override def isEmpty: Boolean = true

    override def all: String = ""

    override def last: String = throw new NoSuchElementException()

    override def previous: LogList = throw new NoSuchElementException()

    override def add(msg: String): LogList = new Log(msg, Empty)

    override def toString: String = ""
  }

  val list =  new Log("m1", new Log("m2", new Log("m3", Empty)))
  println(list.toString)
  println(list.all)
  println(list.isEmpty)
  println(list.last)
  println(list.previous)
  println(list.add("m4"))
}
