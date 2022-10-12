package example

import java.util

object ArrayChunking extends App {

  def chunk(arr: Seq[Int], size: Int): Seq[Seq[Int]] = {
    var accum: Seq[Seq[Int]] = Seq()
    var buffer: Seq[Int] = Seq()

    /**
     * loop
     *  - examine next element.
     *  - if buffer < size, add element to buffer, continue to next element
     *  - else, push buffer to accum, clear buffer, add element to buffer
     *
     *  at end of loop, if buffer non-empty (it will be), then push buffer to accum
     */

    arr.foreach{ elem =>
      if (buffer.length < size) {
        buffer = buffer :+ elem
      } else {
        accum = accum :+ buffer
        buffer = Seq(elem)
      }
    }

    accum = accum :+ buffer
    accum
  }

}
