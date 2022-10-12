package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class StringReversalTest extends AnyFlatSpec with Matchers {
  "reversing a string" should "work" in {
    StringReversal.reversed1("abc") shouldEqual "cba"
    StringReversal.reversed2("abc") shouldEqual "cba"
  }
}
