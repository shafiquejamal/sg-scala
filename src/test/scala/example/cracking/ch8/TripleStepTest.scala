package example.cracking.ch8

import cracking.ch8.TripleStep
import org.scalatest.flatspec.AnyFlatSpecLike
import org.scalatest.matchers.should.Matchers

class TripleStepTest extends AnyFlatSpecLike with Matchers{

  "TripleStep" should "work" in {
    // TripleStep.countWays(1000) shouldEqual 7 // This takes way too long
    TripleStep.countWaysWithMemo(1000) shouldEqual 7
  }

}
