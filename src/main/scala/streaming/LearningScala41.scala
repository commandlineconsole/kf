object LearningScala41 {

  def main(args: Array[String]): Unit = {

    val captainStuff = ("Picard", "Enterprise-D", "NCC-1701-D")

    println(captainStuff)
    println(captainStuff._1 + ", " + captainStuff._2 + ", " +captainStuff._3)                        //> Picard

    val picardsShip = "Picard" -> "Enterprise-D"
    println(picardsShip._1 + " " + picardsShip._2)

    val shipList = List("Enterprise", "Defiant", "Voyager", "Deep Space Nine")
    println(shipList(0) + " " + shipList(1) + " "+ shipList(2) + " "+ shipList(3))

    println(shipList.head + " "+ shipList.tail)
    for (ship <- shipList) {println("ship :" + ship)}

    val backwardShips = shipList.map( (ship: String) => {ship.reverse})
    val backwardShips2 = shipList.reverse
    for (ship <- backwardShips) {println(ship)}

    println("backwardShips2 :" + backwardShips2)
    println("backwardShips :" + backwardShips)

    val numberList = List(1, 2, 3, 4, 5)
    val sum = numberList.reduce( (x: Int, y: Int) => x + y)
    println(sum)

    val iHateFives = numberList.filter( (x: Int) => x != 5)
    val iHateThrees = numberList.filter(_ != 3)
    val iHateFives12 = numberList.map((a: Int) => {(a * 10)/100})
    val iHateFivesFilter = numberList.filter((a : Int) => a != 4).filter((x: Int) => x != 3).filter((x: Int) => x < 3)
    val iHateFivesFilter23 = numberList.reduceOption((a: Int, b: Int) => a + b)

    val numberList12 = List(1, 2, 3, 4, 5)
    val iHateFives123 = numberList12.filter((x : Int) => x > 3)
    val iHateFives1234 = numberList12.map(x => (x,1))

    // val y = numberList.reduceByKey((accum, n) => (accum + n))
    println("iHateFives1234 :" + iHateFives1234)

      //.filter((x: Int) => x != 3).filter((x: Int) => x < 3)

 println("iHateFivesFilter : " + iHateFivesFilter)
    println("iHateFivesFilter23 : " + iHateFivesFilter23)
    val moreNumbers = List(6, 7, 8)                   //> moreNumbers  : List[Int] = List(6, 7, 8)
    val lotsOfNumbers = numberList ++ moreNumbers     //> lotsOfNumbers  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)



  }

}