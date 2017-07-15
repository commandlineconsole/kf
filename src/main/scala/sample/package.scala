package sample

object sample {

  def main(args: Array[String]): Unit = {

    if( 10 > 20) {
      println(" 10 is greater than 2 ")
    } else {println("No false statement")}

    for (x <- 1 to 4) {
      val squared = x * x; println(squared)
    }

    var x = 5
    do {
      println(x); x += 1
    } while (x <= 10)


    var a = 10

    // while loop execution
    while ( {
      a < 20
    }) {
      println("Value of a: " + a)
      a = a + 1
    }

  }

}
