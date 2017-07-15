package sample
object TestMe {

  def main(args: Array[String]): Unit = {

    val shipList = List("Enterprise", "Defiant", "Voyager", "Deep Space Nine")
  //  println(shipList.reverse);
  //  println(shipList.contains("Enterprise"));

// import spark.implicits._
// val NewRec = shipList.map(x =>x.eq("Enterprise"))

    val NewRec1 = shipList.filter((x: String) => x != "Enterprise")
    val NewRec2 = shipList.filter(_ == "Enterprise")
    val NewRec3 = shipList.filter(_.startsWith("E"))

    val NewRec4 = shipList.contains("Enterprise")

    val NewRec5 = shipList.filter(_ != ("Enterprise") ).filter(_ != ("Defiant") ).filter(_ != ("Voyager") ).filter(_ != ("Voyager") )
    val NewRec6 = shipList.filter(_ == (
      "Enterprise") )


  //  println(NewRec)
println(NewRec1);println(NewRec2);println(NewRec3);println(NewRec4);println(NewRec5);println(NewRec6);




  }

}
