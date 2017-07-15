object immutable {

  def main(args: Array[String]): Unit = {

    import scala.collection.mutable

    var immutableSet = Set(1, 2, 3)

    immutableSet += 4
    //this is the same as:
    immutableSet = immutableSet + 4

    //compare to
    val mutableSet = mutable.Set(1, 2, 3)

    mutableSet += 4
    // this is the same as:
    mutableSet.+=(4)

    println(immutableSet, mutableSet)

  }
}
