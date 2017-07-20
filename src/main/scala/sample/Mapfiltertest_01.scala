package sample

// TODO : set, retain, filter, filterkeys

import org.apache.spark.streaming._

object Mapfiltertest_01 {

  def main(args: Array[String]): Unit = {

// TODO *********************************

    val setval = Set("a","b","c")
    val setkey = Set(1,2,3)

    var x = collection.mutable.Map(1 -> "a", 2 -> "b", 3 -> "c")

    val filterval =   x.filter(item => setval(item._2))
    val filterkey =   x.filter(item => setkey(item._1))

    val filterkv =   x.filter(item => setval(item._2))
                       .filter(item => setkey(item._1))

    println("filterval :" + filterval);println("filterkey :" + filterkey);println("filterkv  :" + filterkv)

    val newMap1 = x.filterKeys(Set(2,3))  // TODO : fitler list of keys
    println(newMap1)

    var mlist = x.filter((t) => t._1 > 0)
    println("mlist  :" + mlist)

    var mlist2 = x.filter((t) => t._2 == "c")
    println(mlist2)

    val taketwo = x.take(2)
    println(taketwo)


// TODO ************** retain *******************

    var x3 = collection.mutable.Map(1 -> "a", 2 -> "b", 3 -> "c")
    var retainfilter2 = x3.retain((k,v) => k > 0)

    var x4 = collection.mutable.Map(1 -> "a", 2 -> "b", 3 -> "c")
    var retainfilter3 = x4.retain((k,v) => v == "a")

    println("retainfilter2 " + retainfilter2)  // TODO: print retained values after filter keys
    println("retainfilter3 " + retainfilter3)  // TODO: print retained values after filter keys

// TODO **************** UpperCase transform ******

    var Uppercasev = x.transform((k,v) => v.toUpperCase)
    println(Uppercasev)

 // TODO ***************** filterKeys *************

    val x1 = Map(1 -> "a", 2 -> "b", 3 -> "c", 4 -> "d", 5 -> "e")
    val filterkey2= x1.filterKeys(_ > 2)   // TODO : filter keys greater than 2
println(filterkey2)

    val newMap = x1.filterKeys(Set(2,3))  // TODO : fitler list of keys
    println("newMap :" + newMap)

    // TODO ***************Method for filter ******************

def only1(i: Int) = if (i == 1) true else false

    println(only1(10))  // TODO : method and pass values and return vlues after computation

    val x2 = Map(1 -> "a", 2 -> "b", 3 -> "c")
    val y2 = x2.filterKeys(only1)     // TODO : Filter keys
    println(y2)


  }
}
