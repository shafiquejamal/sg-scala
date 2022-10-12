package example


object Capitalization extends App {

    def capitalize(s: String): String = {
      s.split("\\s+").map { w => w.slice(0, 1).toUpperCase() + w.slice(1, w.length) }.mkString(" ")
    }

}
