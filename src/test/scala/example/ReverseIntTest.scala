package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ReverseIntTest extends AnyFlatSpec with Matchers {
  "reversing an int" should "work" in {
    ReverseInt.reverse(15) shouldEqual 51
    ReverseInt.reverse(981) shouldEqual 189
    ReverseInt.reverse(500) shouldEqual 5
    ReverseInt.reverse(-15) shouldEqual -51
    ReverseInt.reverse(-90) shouldEqual -9
    ReverseInt.reverse(0) shouldEqual 0
  }
}
