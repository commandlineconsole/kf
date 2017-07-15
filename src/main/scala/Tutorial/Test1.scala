package Tutorial

object Test1 {

  def main(args: Array[String]): Unit = {
    println("AAAAAAAAAAAAAAAAA")
    delayed(time())
    println( apply( layout, 10) )
  }

  // *******************

  var inc = (x:Int) => x+1
  var x = inc(7)-1

  var mul = (x: Int, y: Int) => x*y
  println(mul(3, 4))

  var userDir12 = () => { System.getProperty("user.dir") }
  println(userDir12 )

  // *******************

  def time() = {
  System.nanoTime()
  }

  def delayed(t :Long) = {
    println("Parameter : " + t)
  }

    def apply(f: Int => String, v: Int) = f(v)
    def layout[A](x: A) = "[" + x.toString() + "]"
//    println( apply( layout, 10) )
  }

