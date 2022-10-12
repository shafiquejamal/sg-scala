package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MaxCharsTest extends AnyFlatSpec with Matchers {
  "max chars" should "work" in {
     MaxChars.max("abcccccccd") shouldEqual 'c'
    MaxChars.max("apple 1231111") shouldEqual '1'
  }
}
