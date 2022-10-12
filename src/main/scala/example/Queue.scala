package example

class Queue[T] {

  private var list: List[T] = List()

  def add(e: T): Unit = {
    list = e +: list
  }

  def remove(): Option[T] = {
    val temp = list.reverse
    val maybeHead = temp.headOption
    list = (if (temp.isEmpty) List() else temp.tail).reverse
    maybeHead
  }

  def peek: Option[T] = {
    if (list.isEmpty) None else list.reverse.headOption
  }
}
