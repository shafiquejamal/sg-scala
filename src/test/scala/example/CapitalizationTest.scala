package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CapitalizationTest extends AnyFlatSpec with Matchers {
  "capitalize" should "work" in {
    Capitalization.capitalize("a short sentence") shouldEqual "A Short Sentence"
    Capitalization.capitalize("a lazy fox") shouldEqual "A Lazy Fox"
    Capitalization.capitalize("look, it is working!") shouldEqual "Look, It Is Working!"
  }
}
