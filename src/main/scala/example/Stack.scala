package example

class Stack[T] {

  private var list: List[T] = List()

  def push(e: T): Unit = {
    list = e +: list
  }

  def pop(): Option[T] = {
    val maybeHead = list.headOption
    if (list.nonEmpty) list = list.tail
    maybeHead
  }

  def peek: Option[T] = list.headOption

}
