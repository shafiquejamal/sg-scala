package example

import scala.collection.mutable

object FizzBuzz extends App {

  def fizzBuzz(n: Int): Unit = {
    for (i <- n to 1 by -1) {
      if (i % 3 == 0 && i % 5 == 0) {
        println("fizbuzz")
      } else if (i % 3 == 0) {
        println("fizz")
      } else if (i % 5 == 0) {
        println("buzz")
      } else {
        println(i)
      }
    }
  }

}
