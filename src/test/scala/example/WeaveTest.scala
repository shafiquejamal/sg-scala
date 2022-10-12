package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class WeaveTest extends AnyFlatSpec with Matchers {
  "weave should" should "work" in {
    val q1 = new Queue[Int]()
    q1.add(1)
    q1.add(3)
    q1.add(5)
    q1.add(7)
    val q2 = new Queue[Int]()
    q2.add(2)
    q2.add(4)
    val q3 = Weaver.weave(q1, q2)
    q3.remove() should contain(1)
    q3.remove() should contain(2)
    q3.remove() should contain(3)
    q3.remove() should contain(4)
    q3.remove() should contain(5)
    q3.remove() should contain(7)
    q3.remove() shouldBe empty

  }
}
