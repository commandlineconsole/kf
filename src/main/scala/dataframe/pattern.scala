package dataframe

object pattern {
  def main(args: Array[String]): Unit = {

    class Person (name: String, age: Int) {

      def canEqual(a: Any) = a.isInstanceOf[Person]

      override def equals(that: Any): Boolean =
        that match {
          case that: Person => that.canEqual(this) && this.hashCode == that.hashCode
          case _ => false
        }

      override def hashCode: Int = {

        val prime = 31
        var result = 1

        result = prime * result + age;
        result = prime * result + (if (name == null) 0 else name.hashCode)
        return result

      }
    }

  }
}

/*

/*

      def unapply(x : Int) : Option[String] =

        if(x == 0) Some("Hello, World") else None
      println("unapply(1) : " + unapply(1))
    println("unapply(0) : " + unapply(0))

      def apply(name: String): String = {
        "Hello %s".format(name)
      }

    apply("bob")


    val v1 = List(("Mark", 4), ("Charles", 5)).filter(pair => pair._2 == 4)
    val v2 = List(("Mark", 4), ("Charles", 5)).filter { case(name, number) => number == 4 }

    println(v1)
    println(v2)
*/

/*

List(("Mark", 4), ("Charles", 5)).filter(case(name, number) => number == 4)
List(("Mark", 4), ("Charles", 5)).filter(case(name, number) => number == 4)
List(("Mark", 4), ("Charles", 5)).filter { case(name, number) => number == 4 }

*/

* */
