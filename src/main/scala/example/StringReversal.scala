package example

object StringReversal extends App {

  val input = Option(args(0)).getOrElse("reverse-me");

  def reversed1(input: String): String = {
    input.reverse
  }

  def reversed2(input: String): String = {
    var reversed = new StringBuilder("");
    input.foreach{ c =>
      reversed.insert(0, c);
    }
    reversed.toString()
  }
}
