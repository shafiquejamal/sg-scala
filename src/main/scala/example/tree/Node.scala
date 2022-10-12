package example.tree

import scala.annotation.tailrec

case class Node[T](data: T, var children: Seq[Node[T]] = Seq()) {

  def add(data: T): Unit = {
    children = children :+ Node(data)
  }

  def remove(data: T): Unit =  {
    children = children.filterNot(child => child.data == data)
  }
}

case class Tree[T](root: Option[Node[T]] = None) {

  def traverseBfRecursive[U](fn: Node[T] => U): Unit = {

    @tailrec
    def _traverse(nodes: Seq[Node[T]]): Unit = {
      if (nodes.nonEmpty) {
        nodes.foreach(fn)
        val nextNodes = nodes.flatMap(n => n.children)
        _traverse(nextNodes)
      }
    }

    _traverse(root.toVector)
  }

  def traverseBfIterative[U](fn: Node[T] => U): Unit = {
    var nodesToProcess: Seq[Node[T]] = root.toVector
    while (nodesToProcess.nonEmpty) {
      nodesToProcess.foreach(fn)
      nodesToProcess = nodesToProcess.flatMap(n => n.children)
    }
  }

  def traverseDfIterative[U](fn: Node[T] => U): Unit = {
    // treat this as a stack
    var nodesToProcess: Seq[Node[T]] = root.toVector
    while (nodesToProcess.nonEmpty) {
      val nodeToProcess = nodesToProcess.head
      val childrenToAddToStack = nodeToProcess.children
      nodesToProcess = childrenToAddToStack ++: nodesToProcess
      fn(nodeToProcess)
    }
  }

//  def traverseDfRecursive[U](fn: Node[T] => U): Unit = {
//
//    def _traverse
//
//  }
}
