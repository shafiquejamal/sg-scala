package example

object Weaver {

  def weave[T](q1: Queue[T], q2: Queue[T]): Queue[T] = {
    val q3 = new Queue[T]()
    while (q1.peek.nonEmpty || q2.peek.nonEmpty) {
      q1.remove().foreach(q3.add)
      q2.remove().foreach(q3.add)
    }
    q3
  }

}
