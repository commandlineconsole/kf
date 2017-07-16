package sample

object MapFilter {

  def main(args: Array[String]): Unit = {

    var x = collection.mutable.Map(1 -> "a", 2 -> "b", 3 -> "c")
    println("print collection :" + x)     // TODO : print all colletion

    var retainfilter = x.retain((k,v) => k > 1)
    println("retain " + retainfilter)  // TODO: print retained values after filter keys

    var Uppercasev = x.transform((k,v) => v.toUpperCase)
    println(Uppercasev)             // TODO : convert lower case to upper case

    val x1 = Map(1 -> "a", 2 -> "b", 3 -> "c", 4 -> "d", 5 -> "e")
    val y = x1.filterKeys(_ > 2)  // TODO : filter keys greater than 2
    println(y)

    def only1(i: Int) = if (i == 1) true else false

     println(only1(10))  // TODO : method and pass values and return vlues after computation

    val x2 = Map(1 -> "a", 2 -> "b", 3 -> "c")
    val y2 = x2.filterKeys(only1)     // TODO : Filter keys
    println(y2)

    val newMap = x2.filterKeys(Set(2,3))  // TODO : fitler list of keys
    println(newMap)

    var m = Map(1 -> "a", 2 -> "b", 3 -> "c")
    var mlist = m.filter((t) => t._1 > 0)
    println(mlist)                      // TODO :  filter data

    var mlist2 = m.filter((t) => t._2 == "c")
    println(mlist2)

    val taketwo = m.take(2)
    println(taketwo)

  }
}
