package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class AnagramsTest extends AnyFlatSpec with Matchers {
  "sort, map" should "work" in {
    Anagrams.isAnagramSorted("rail safety", "fairy tales") shouldBe true
    Anagrams.isAnagramMap("rail safety", "fairy tales") shouldBe true

    Anagrams.isAnagramSorted("RAIL! SAFETY!", "fairy tales") shouldBe true
    Anagrams.isAnagramMap("RAIL! SAFETY!", "fairy tales") shouldBe true

    Anagrams.isAnagramSorted("Hi there", "Bye there") shouldBe false
    Anagrams.isAnagramMap("Hi there", "Bye there") shouldBe false
  }
}
