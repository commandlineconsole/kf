object imp {

  def main(args: Array[String]): Unit = {

    val personSet = Set(("Alice",1), ("Bob",2), ("Carol",3))
    val range = 1 to 10

     def findByName(name: String) = personSet.find(_._1 == name).getOrElse(("David", 4))
     val findBob = findByName("Bob")

    import collection.mutable
    val mset = mutable.HashSet("a", "b", "c")

    mset += "e"; mset ++= Set("f", "g")

    val filter = range.filter(_ > 4); val multiple = range.map(_ * 2)

    println("filter :" + filter )
    println("multiple :" + multiple )
    println("findByName :" + findByName("Alice") )
    println("findBob :" + findBob._1 )
    println("mset :" + mset )
  }

}
