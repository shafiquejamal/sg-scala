package example

object ReverseInt extends App {

  def reverse(int: Int): Int = {
    val sign = if (int == 0) 1 else Math.abs(int)/int
    val reversed = Math.abs(int).toString.reverse.toInt * sign
    reversed
  }

}
