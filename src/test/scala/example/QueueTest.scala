package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class QueueTest extends AnyFlatSpec with Matchers {
  "queue should" should "work" in {
    val q = new Queue[Int]()
    q.peek shouldBe empty
    q.add(1)
    q.peek should contain(1)
    q.add(2)
    q.peek should contain(1)
    q.add(3)
    q.remove should contain(1)
    q.peek should contain(2)
    q.remove should contain(2)
    q.peek should contain(3)
    q.remove should contain(3)
    q.remove shouldBe empty
    q.peek shouldBe empty
  }
}
