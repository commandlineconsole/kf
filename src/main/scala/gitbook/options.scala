package gitbook

object options {

  def main(args: Array[String]): Unit = {

    def f1(f: AnyRef) = "You"
    def f2(f: AnyRef) = "Every"
    def f3(f: AnyRef) = "Body"
    val f = "start"

    val fin = for (

      r1 <- Option {f1(f)};
      r2 <- Option {f2(f)};
      r3 <- Option {f3(f)}

    ) yield r3


    fin.foreach(println)
    fin.foreach { res => println("YouEveryBody") }
    fin.foreach{ res => "f1(f)"}
   // fin.foreach(println)

  }
}