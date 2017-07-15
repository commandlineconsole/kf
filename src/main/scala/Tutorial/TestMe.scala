package Tutorial

object Demo4 {

  def main(args: Array[String]) {
    delayed(time());
  }

  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime
  }
  def delayed( t: => Long ) = {
    println("In delayed method")
    println("Param: " + t)
  }
}