package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PalindromeTest extends AnyFlatSpec with Matchers {
  "detecting a palindrome" should "work" in {

    Palindrome.isPalindrome("abcdcba") shouldBe true
    Palindrome.isPalindrome("abccba") shouldBe true
    Palindrome.isPalindrome("abccb1") shouldBe false
  }
}
