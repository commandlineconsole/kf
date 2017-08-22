package faq

object Maps extends App{

  var m = Map(("one",2))  // key and value pairs

  m += (("two", 3),
    ("three", 4),
    ("four", 5),
    ("five", 6),
    ("six", 7),
    ("seven", 8),
    ("eight", 9),
    ("nine", 10),
    ("ten",11))

  m.foreach(println)

  println("***************")

  m.foreach((t: (String, Int)) => {
    val pair = t._1 + "=" + t._2
    println(pair)
  })

  val filtered = m.filter((t: (String, Int)) => t._2 % 2 == 0)
  println(filtered)

  val filtered2 = m.filter((t: (String, Int)) => (t._1.length() == 3 && t._2 % 2 == 0))
  println(filtered2)


}


