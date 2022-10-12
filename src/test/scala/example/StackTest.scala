package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class StackTest extends AnyFlatSpec with Matchers {
  "staci should" should "work" in {
    val s = new Stack[Int]()
    s.peek shouldBe empty
    s.push(1)
    s.peek should contain(1)
    s.push(2)
    s.peek should contain(2)
    s.push(3)
    s.peek should contain(3)
    s.pop() should contain(3)
    s.peek should contain(2)
    s.pop() should contain(2)
    s.peek should contain(1)
    s.pop() should contain(1)
    s.pop() shouldBe empty
    s.peek shouldBe empty
  }
}
