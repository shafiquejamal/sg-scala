package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ArrayChunkingTest extends AnyFlatSpec with Matchers {
  "chunk" should "work" in {
    val expected1 = ArrayChunking.chunk(Seq(1,2,3,4), 2)
    expected1 should have length(2)
    expected1.head should contain theSameElementsInOrderAs Seq(1,2)
    expected1(1) should contain theSameElementsInOrderAs Seq(3,4)
  }

  it should "work 2" in {
    val expected1 = ArrayChunking.chunk(Seq(1,2,3,4,5), 2)
    expected1 should have length(3)
    expected1.head should contain theSameElementsInOrderAs Seq(1,2)
    expected1(1) should contain theSameElementsInOrderAs Seq(3,4)
    expected1(2) should contain theSameElementsInOrderAs Seq(5)
  }

  it should "work 3" in {
    val expected1 = ArrayChunking.chunk(Seq(1,2,3,4,5,6,7,8), 3)
    expected1 should have length(3)
    expected1.head should contain theSameElementsInOrderAs Seq(1,2,3)
    expected1(1) should contain theSameElementsInOrderAs Seq(4,5,6)
    expected1(2) should contain theSameElementsInOrderAs Seq(7, 8)
  }
}
