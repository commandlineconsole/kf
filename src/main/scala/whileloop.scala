object test2{

  var i, sum = 0
  var sum1 = 0

  while ( i < 10) {
    sum += i
    i+=1
  }

  for ( i <- 0 until 10) {
    sum1 += i
  }

  val sum3 = (0 until 10).sum

  // *******

  if (true)
    println("no braces on a single expression")

  if (1 + 1 == 2) {
    println("multiple")
    println("statements")
    println("require")
    println("braces")
  } else {
    println("new math is found!")
    println("or your CPU went crazy")
  }

  val likeEggs = false
  val breakfast =
    if (likeEggs) "scrambled eggs"
    else "Apple"

  // *******

  val selection = "One"




  def main(args: Array[String]): Unit = {

    println(sum)
    println(sum1)
    println(sum3)
    println(breakfast)

    selection match {
      case "One" => println("You selected option one!")
      case "Two" => println("You selected option two!")
      case _ => println("You selected something else: ")
    }

  }
}