package example

object Palindrome extends App {

  def isPalindrome(str: String): Boolean = {
    // can check if string === reverse(string)
    // or check element by element
    val length = str.length;
    val lastIndex = length - 1;
    val checkUpTo: Int = (if (length % 2 == 0) Math.floor(lastIndex / 2) else Math.floor(lastIndex / 2) - 1).toInt;
    for (i <- 0 to checkUpTo) {
      if (str(i) != str(lastIndex - i)) {
        return false;
      }
    }

    true
  }

}
