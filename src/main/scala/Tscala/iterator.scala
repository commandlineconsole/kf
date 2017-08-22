package Tscala

object iterator {

  def main(args: Array[String]) {

    // ''''''''''''''''''''''''''''''''''''''''''''''''''''''

      val it = Iterator("a", "number", "of", "words")

    while (it.hasNext){
      println(it.next())
    }

    // ''''''''''''''''''''''''''''''''''''''''''''''''''''''

      val ita = Iterator(20,40,2,50,69, 90)
      val itb = Iterator(20,40,2,50,69, 90)

    println("Value of ita.size : " + ita.size )
    println("Value of itb.length : " + itb.length)

    // ''''''''''''''''''''''''''''''''''''''''''''''''''''''

    val ita1 = Iterator(20,40,2,50,69, 90)
    val itb1 = Iterator(20,40,2,50,69, 90)

    println("Maximum valued element " + ita1.max )
    println("Minimum valued element " + itb1.min )

    // ''''''''''''''''''''''''''''''''''''''''''''''''''''''

    val a = "abcd".combinations(1)
    val b = "efg".combinations(2)

    val c = a++b

    println(c.toList)
    // ''''''''''''''''''''''''''''''''''''''''''''''''''''''

    val s1: Iterable[Int] = Set(1,2,3)

    val s2: Iterable[Int] = Set(2,4)

     println(s1 ++ s2)

    // ''''''''''''''''''''''''''''''''''''''''''''''''''''''

    val s3 = Set(1,2,3)

    val s4 = Set(2,4)

    println(s3 ++ s4)

    // ''''''''''''''''''''''''''''''''''''''''''''''''''''''


    val it1 = Iterator(1, 2, 3, 4)

    val bit = it1.buffered

    println("bit :" + bit.head)
    println("bit :" + bit.next())
    println("bit :" + bit.contains(4))
    println("bit :" + bit.filter(_ % 2 == 0))

    // ''''''''''''''''''''''''''''''''''''''''''''''''''''''

    val fruits = Set("orange", "peach", "apple", "banana")

    val x = fruits.filter(_.startsWith("a"))

    val y = fruits.filter(_.length > 5)

    println("x : " + x)
    println("y : " + y)  // exists

    // ''''''''''''''''''''''''''''''''''''''''''''''''''''''

    def onlyStrings(a: Any) = a match {
      case s: String => true
      case _ => false
    }

    println("onlyStrings :" + onlyStrings(9))
    println("onlyStrings :" + onlyStrings())

    val list2 = "apple" :: "banana" :: 1 :: 2 :: Nil

    val strings = list2.filter {
           case s: String => true
             case _ => false
         }

    println(strings)


    def toInt(s: String): Option[Int]= {
      try {
        Some(s.toInt)
      } catch {
        case e: Exception => None
      }
    }

    println(toInt("233"))
    println(toInt(""))


    val greeting: Option[String]  = Some("Hello world")

    println("greeting : " + greeting)

    // -----------------------

    println(List("Scala", "Java", "Haskell") exists (x => x == "Scala"))

    println("List(1, 2, 3).flatMap(x => Some('x').map(y => (x, y))) :  \n" +
      List(1, 2, 3).
        flatMap(x => Some('x')
          .map(y => (x, y))
        )
    )

    List(1, 2, 3).
      flatMap(x => Some('x')
        .map(y => (x, y))
      )

    // **********************

    val fruits5 = Set("orange", "peach", "apple", "banana")

     println(fruits5)
    fruits5.foreach(println)
println("fruits5.clone()    :" + fruits5.!=("orange"))

  }
  }

