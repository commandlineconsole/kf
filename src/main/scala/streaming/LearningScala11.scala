object LearningScala11 {

  def main(args: Array[String]): Unit = {

    val hello: String = "Hola!" //> hello  : String = Hola!
    println(hello) //> Hola!

    var helloThere: String = hello  //> helloThere  : String = Hola!
    helloThere = hello + " There!3"
    println(helloThere) //> Hola! There!

    val immutableHelloThere: String = hello + "There!"
    println(immutableHelloThere)


    val numberOne: Int = 1 //> numberOne  : Int = 1
    val truth: Boolean = true //> truth  : Boolean = true
    val letterA: Char = 'a' //> letterA  : Char = a
    val pi: Double = 3.14159265 //> pi  : Double = 3.14159265
    val piSinglePrecision: Float = 3.14159265f //> piSinglePrecision  : Float = 3.1415927
    val bigNumber: Long = 1234567890l //> bigNumber  : Long = 1234567890
    val smallNumber: Byte = 127 //> smallNumber  : Byte = 127

    println("Here is a mess: " + numberOne + " " + truth + " " + letterA +  " " +pi + " " + bigNumber)

    // printf style:
    println(f"Pi is about $piSinglePrecision%.2f") //> Pi is about 3.142
    println(f"Zero padding on the left: $numberOne%010d")
    //> Zero padding on the left: 00001

    // Substituting in variables:
    println(s"I can use the s prefix to use variables like $numberOne $truth $letterA")

    println(s"The s prefix isn't limited to variables; I can include any expression. Like ${1 + 2}")

    val theUltimateAnswer: String = "To life, the universe, and everything is 42."

    val pattern = """.* ([\d]+).*""".r
    val pattern(answerString) = theUltimateAnswer //> answerString  : String = 42
    val answer = answerString.toInt //> answer  : Int = 42
    println(answer) //> 42


    // Dealing with booleans
    val isGreater = 1 > 2 //> isGreater  : Boolean = false
    val isLesser = 1 < 2 //> isLesser  : Boolean = true
    val impossible = isGreater & isLesser //> impossible  : Boolean = false
    val anotherWay = isGreater && isLesser //> anotherWay  : Boolean = false

    val picard: String = "Picard" //> picard  : String = Picard
    val bestCaptain: String = "Picard" //> bestCaptain  : String = Picard
    val isBest: Boolean = picard == bestCaptain //> isBest  : Boolean = true

// println("bestCaptain, $bestCaptain%f")  // %.2f
    println(isBest)



  }
}