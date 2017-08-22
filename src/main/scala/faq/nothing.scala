package faq

object nothing extends App {

  def toInt(in: String): Option[Int] = {
    try {
      Some(Integer.parseInt(in.trim))
    } catch {
      case e: NumberFormatException => None
    }
  }

  toInt("a121") match {
    case Some(i) => println(i)
    case None => println("That didn't work.")
  }

}
