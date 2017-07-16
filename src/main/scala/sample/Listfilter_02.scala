package sample

object Listfilter_02 {

  def main(args: Array[String]): Unit = {

    val nums = List(5, 1, 4, 3, 2)
    val fruits = List("orange", "peach", "apple", "banana")

    val numfil = nums.filter(_ > 2)
    val numfildiv = nums.filter(_ % 2 == 0)
    val numsort = nums.filter(_ % 2 == 0).sorted

    val fstring =  fruits.filter(_.length > 5)
    val fstringstartwith = fruits.filter(_.startsWith("a"))

/*    println(numfil)
    println(numfildiv)
    println(numsort)

    println(fstring)
    println(fstringstartwith)*/

    trait Person {
      def first: String
      def age: Int
      def valid: Boolean
    }


    case class Person2(first: String, last: String, mi: String)

    val fred = Person2("Fred", "Flintstone", "J")
    val wilma = Person2("Wilma", "Flintstone", "A")
    val ja = Person2("Ja", "Flintstone", "A")
    val naidu = Person2("Naidu", "Flintstone", "A")
    val adu = Person2("Adu", "Flintstone", "A")

    val barney = Person2("Barney", "Rubble", "J")
    val betty = Person2("Betty", "Rubble", "A")
    val peeps = Seq(fred, wilma, barney, betty, ja, naidu,adu)

    val fil1 =  peeps.filter(_.last == "Flintstone").map(_.first)
    val fil2 =  peeps.filter(_.last == "Flintstone").map(person => person.first)
    val fil3 =  peeps.filter(_.last == "Flintstone").map(_.first).map(_.last)

    val fil4 =  peeps.filter(_.last == "Flintstone").map(_.first).sorted
    val fil5 =  peeps.filter(_.last == "Flintstone").map(_.first)
    val fil6 =  peeps.filter(_.last == "Flintstone").map(_.mi).sorted

    println(fil1)
    println(fil2)
    println(fil3)
    println(fil4)
    println(fil5)
    println(fil6)

  }

}
