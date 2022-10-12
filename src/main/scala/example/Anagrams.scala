package example

import scala.collection.mutable

object Anagrams extends App {

  def isAnagramSorted(s1: String, s2: String): Boolean = {
    s1.toLowerCase().replaceAll("""[^\w]+""", "").sorted ==
      s2.toLowerCase().replaceAll("""[^\w]+""", "").sorted
  }

  def isAnagramMap(s1: String, s2: String): Boolean = {
    val m = new mutable.HashMap[Char, Int]()
    val s1a = s1.toLowerCase().replaceAll("""[^\w]+""", "")
    val s2a = s2.toLowerCase().replaceAll("""[^\w]+""", "")
    val (longer, shorter) = if (s1.length > s2.length) (s1a, s2a) else (s2a, s1a)
    shorter.foreach{ c =>
      val currentCount = m.getOrElse(c, 0)
      val newCount = currentCount + 1
      m.put(c, newCount)
    }

    longer.foreach{c =>
      val newCount = m.getOrElse(c, 0) - 1
      if (newCount < 0) {
        return false
      }
      m.put(c, newCount)
    }

    true
  }

}
