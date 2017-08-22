package gitbook

object function {

  def main(args: Array[String]): Unit = {

    def addOne(num: Int ): Int = num + 1
    println(addOne(12))

    def timesTwo(i: Int): Int = {println("hello world")
      i * 2}

    println(timesTwo(12))

    // *************************************

    def add(m: Integer, n: Integer) = m + n
    val add2 = add(2, _:Int)
    println("add2 :" + add2(2))
    println("add :" + add(1,2))

    // *************************************

    def captializeAll(args: String*){
      args.map{ arg =>
        arg.capitalize
      }
    }

    println("captializeAll :" + captializeAll("jagan", "naidu", "cap"))

    // ****************************

    class Calculator {
      val brand = "HP"
      def add(m:Integer, n:Integer) = m+n
    }

    val cal = new Calculator
    println(cal.add(2,3))

// ********************

    class Calculator2(brand:String){

      val color: String =
        if ("brand" == "TI"){
        "blue"
      } else if ("brand" == "HP") {
        "black"
      } else {
        "white"
      }

      // An instance method
      def add(m:Integer, n:Integer) = m+n


    }
    val cal2 = new Calculator2("TI")
    println(cal2.color)

    // ************************

    trait Car {
      val brand: String
    }

    trait Shiny{
      val shineRefraction: Int
    }

    trait Miles{
      val miles: Int
    }

    class BMW extends Car with Shiny with Miles{
      val brand = "BMW"
      val shineRefraction = 12
      val miles = 500
    }

       val BMW2 = new BMW

      println(BMW2.brand)
      println(BMW2.shineRefraction)
      println(BMW2.miles)


  }

}
