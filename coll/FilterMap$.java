object FilterMap {

def main(args: Array[String]): Unit = {

  var x = 1 + 2 //> 3
  var x1 =  (1).+(2)
  var x2 = 1 + 2 //> x = 3
  var x3 = 3 * 4 //> x = 12

  import scala.math._

  val Tau = Pi*2

//  println(s"Happy $Tau Day")
//  println("x :"+x);   println("x1 :" +x1) ;  println("x2 : " +x2);   println("x3 :" +x3)
//  printf("Now you have %.16f problems.", Math.nextAfter(2.0, 3))


  //Number operations
  //Ranges
  //creates a range between 1 to 10 inclusive
  val range = 1 to 10
  //creates a range between 1 to 10 exclusive
  val range2 = 1 until 10
  //from 2 to 10 with jumps of 3
  val range3 = 2 until 10 by 3

  println(range.toList) //List(2, 5, 8)
  println(range2.toList) //List(2, 5, 8)
  println(range3.toList) //List(2, 5, 8)

  //Number convinience methods
  val num = -5
  val numAbs = num.abs //absolute value
  val max5or7 = numAbs.max(7)
  val min5or7 = numAbs.min(7)

  println(numAbs) //5
  println(max5or7) //7
  println(min5or7) //5

  //String operations

  val reverse = "Scala".reverse //reverse a string
  println(reverse) //alacS

  val cap = "scala".capitalize //make first char caps
  println(cap) //Scala

  val multi = "Scala!" * 7 //repeat n times
  println(multi) //Scala!Scala!Scala!Scala!Scala!Scala!Scala!

  val int = "123".toInt //parse as Int
  println(int)


  //Useful methods on collections

  //filter - keep only items larger than 4
  val moreThan4 = range.filter(_ > 4)
  println(moreThan4) //Vector(5, 6, 7, 8, 9, 10)

  //map - transform each item in the collection
  val doubleIt = range2.map(_ * 2)

  println(doubleIt) //Vector(2, 4, 6, 8, 10, 12, 14, 16, 18)*/

}
    }
