package Edureka.traits


/*
 * This example is just a demo of various useful
 * higher order functions available with collections 
 */
object Main12 extends App {
  def demo{

	  // (1 to 9).map(0.1 * _).foreach(println)
	  // (1 to 9).map("*" * _).foreach(println _)
	  // (1 to 9).filter(_ % 2 == 0).foreach(println _)
	  // println((1 to 4).reduceLeft(_ * _))  // 1*1 , 2*2 , 3*3, 4*4
    // 16 + 9
	  
	  val x = "Mary had a little lamb Jagannathan".split(" ").sortWith(_.length < _.length)
	  for (i <- x) println(i)
//

  }
  
  demo
}