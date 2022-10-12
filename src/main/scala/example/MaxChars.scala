package example

import scala.collection.mutable

object MaxChars extends App {

  def max(string: String): Char = {
    val m = new mutable.HashMap[Char, Int]()
    var currentMax: Option[(Char, Int)] = None
    string.foreach{c =>
      val current = m.getOrElseUpdate(c, 0)
      val newCount = current + 1
      m.put(c, newCount)
      val currentMaxCount = currentMax.map{case (_, ct) => ct}.getOrElse(0)
      if (currentMaxCount < newCount) {
        currentMax = Some((c, current + 1))
      }
    }

    currentMax.get._1
  }

}
