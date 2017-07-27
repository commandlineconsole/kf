package samplescala

object Main {
  def main(args: Array[String]) {
    val args = 1233
    val res = for (a <- args) yield a.toUpperCase
    println("Arguments: " + res)
  }
}