package example

case class Node[T](var data: T, var next: Option[Node[T]] = None)

case class LinkedList[T](var head: Option[Node[T]] = None) {

  def insertFirst(data: T): Unit = {
    if (head.isEmpty) {
      head = Some(Node(data))
    } else {
      val node: Node[T] = Node(data, head)
      head = Some(node)
    }
  }

  def size: Int = {
    var count = 0
    var maybeNode = head
    while (maybeNode.nonEmpty) {
      count += 1
      maybeNode = maybeNode.flatMap(_.next)
    }
    count
  }

}
