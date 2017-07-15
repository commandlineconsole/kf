package coll;object classitem {

  def main(args: Array[String]): Unit = {

    //Simple class that does nothing
    class Person(fname:String, lname:String)
    val p1 = new Person("Alice", "In Chains")

    //p1.fname / lname is not accessible

    //A class with a method
    class Person2(fname:String, lname:String){
      def greet = s"Hi $fname $lname!"
    }

    val p2 = new Person2("Bob", "Marley")
    println("p2 :" +p2.greet)
    //p2.fname / lname is not accessible

    //A class with a public read only variable
    class Person3(fname:String, lname:String){
      // a public read only field
      val fullName = s"$fname $lname"
      def greet = s"Hi $fullName!"
    }

    val p3 = new Person3("Carlos", "Santana")
    println("p3.greet :" +p3.greet)
  //  println(p3.fullName)
    println("p3 :" + p3.fullName)
    //p3.fname / lname is not accessible

    //auto creates a getter for fname, and getter + setter to lname
    class Person4(val fname:String, var lname:String)

    val p4 = new Person4("Dave", "Matthews") {
      //override the default string representation
      override def toString = s"$fname $lname"
    }

    println(p4.fname); println(p4.lname)

    //lname is defined as var, so it has a setter too

    p4.lname = "Grohl"
    println(p4)

  }

}
