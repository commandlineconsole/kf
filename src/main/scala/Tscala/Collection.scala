package Tscala

object Collection {

  def main(args: Array[String]): Unit = {

    val list = (1 to 12).toList
// Filter and filternot

    val doubleFiltered1: List[Int] =
      list.iterator
        .filterNot(_ % 2 == 0)
        .filterNot(_ % 3 == 0)
        .toList

    val doubleFiltered2: List[Int] =
      list.iterator
        .filter(_ % 2 == 0)
        .filter(_ % 3 == 0)
        .toList

    val doubleFiltered3: List[Int] =
      list.iterator
        .toList

    val doubleFiltered4: List[Int] =
      list.iterator
        .filter(_ > 2 )
        .filter(_ < 8)
        .toList

    println("doubleFiltered1 :" + doubleFiltered1)
    println("doubleFiltered2 :" + doubleFiltered2)
    println("doubleFiltered3 :" + doubleFiltered3)
    println("doubleFiltered4 :" + doubleFiltered4)

    // ********* Exists ***************

    val l=(1 to 4) toList

   println( l exists (_>5))
    println(l exists (_<2))
    println(l exists (a => a<2 || a>5))

    // *********************
  val x = List(1,2,3)
   x.foreach { println }

// ******************

    val x5 = List(1,2,3)  //   val x = List(1,2,3)
    x5.foreach(println)

    x5.foreach { println }
    var sum = 0
    val x6 = List(1,2,3)


  }
}