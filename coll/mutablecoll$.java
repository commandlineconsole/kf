object mutablecoll{

  def main(args: Array[String]): Unit = {


    import scala.collection.mutable

    val arrayBuffer = mutable.ArrayBuffer(1, 2, 3)
    val listBuffer = mutable.ListBuffer("a", "b", "c")
    val hashMap = mutable.Map("one" -> 1, "two" -> 2, "three" -> 3)

    arrayBuffer += 4
    listBuffer += "d"
    arrayBuffer -= 1
    listBuffer -= "a"
    hashMap += "four" -> 4
    hashMap -= "one"

    arrayBuffer ++= List(5, 6, 7)
    hashMap ++= Map("five" -> 5, "six" -> 6)
    hashMap --= Set("one", "three")

    println(arrayBuffer)
    println(listBuffer)
    println(hashMap)



  }

}
