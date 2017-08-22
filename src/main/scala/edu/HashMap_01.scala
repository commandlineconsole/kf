package edu

object HashMap_01 {
  def main(args: Array[String]): Unit = {

    val x = List("a" -> "b", "c" -> "d", "a" -> "f")
    val y = List(("a","b"), ("c","d"), ("a","f"))


    println(x.groupBy(_._1).map { case (k, v) => (k, v.map(_._2)) })
    println(x.groupBy(_._1).map { case (k, v) => (k, v.map(_._1)) })

    println(x.map(_._1))
    println(x.map(_._2))
    println(x.map(_.__resultOfEnsuring))

    println(x.groupBy(_._1))
    println(x.groupBy(_._2))
    println(x.groupBy(_._1).mapValues(_.map(_._2)))

    println(y.groupBy(_._1))
    println(x.groupBy(_._1))
    println(x.groupBy(_._2))
    println(x.groupBy(_._1).map { case (k, v) => (k, v.map(_._2)) })
    println(x.groupBy(_._1).map { case (k, v) => (k, v.map(_._1)) })


    val states = Map("AL" -> "Alabama", "AK" -> "Alaska")
    var states2 = scala.collection.immutable.Map("AL" -> "Alabama12")
    println(states2)
    println(states)



/*
    var states3 = scala.collection.mutable.Map[String, String]()
    var states3 = scala.collection.mutable.Map("AL" -> "Alabama", "AK" -> "Alaska")
*/

/*    states3 += ("AZ" -> "Arizona")
    states3 += ("CO" -> "Colorado", "KY" -> "Kentucky")
    states3 -= "KY"
    states3 -= ("AZ", "CO")*/

    val m1 = Map("fname" -> "Al", "lname" -> "Alexander")

     for ((k,v) <- m1)
        // printf("key: %s, value: %s\n", k, v)
       printf("%s, %s\n", k, v)

    m1.foreach (x => println (x._1 + "-123->" + x._2))
    m1.foreach {case (key, value) => println (key + "-456->" + value)}
    println(m1)


   // states("AK") = "Alaska, The Big State"

    val p1Ratings = Map("Lady in the Water"-> 3.0,
      "Snakes on a Plane"-> 4.0,
      "You, Me and Dupree"-> 3.5)

    println(p1Ratings)
    p1Ratings.foreach(println)

    /*1Ratings.keys.foreach( (movie) =>
      if (p1Ratings.contains(movie)) similarItems += (movie -> true)
    )
*/

  }
}
