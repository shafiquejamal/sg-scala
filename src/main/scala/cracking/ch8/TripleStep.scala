package cracking.ch8

import scala.collection.mutable

object TripleStep {

  def countWays(n: Int): Int = {
    if (n < 0) {
      0
    } else if (n == 0) {
      1
    } else {
      countWays(n-3) + countWays(n-2) + countWays(n-1)
    }
  }

  def countWaysWithMemo(n: Int): Int = {

    val memo = new mutable.HashMap[Int, Int]()

    def _countWaysWithMemo(n: Int): Int = {
      if (memo.contains(n)) {
        memo(n)
      } else if (n < 0) {
        0
      } else if (n == 1) {
        1
      } else {
        memo.put(n, _countWaysWithMemo(n-3) + _countWaysWithMemo(n-2) + _countWaysWithMemo(n-1))
        memo(n)
      }
    }

    _countWaysWithMemo(n)

  }

}
