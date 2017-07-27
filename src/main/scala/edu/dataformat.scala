package edu
import java.util.Calendar

object dataformat {

  def main(args: Array[String]): Unit = {

      val s: String = "01/01/2015 11:11"
      val dat = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm").parse(s)
      var cal: Calendar = Calendar.getInstance()
      cal.setTime(dat)
      val minuteFormat = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm").format(cal.getTime)
       cal.getTime

   //   println(minuteFormat)
 //     minuteFormat.foreach(println)


      val s1: String = "20161207_11:31_v40"

    def toRemerged(s1: String): String = {
      var retvalue = "v26"
      if (s1 != null && s1 != "" && s1.toString.indexOf("_") >= 0) {
        val first = s1.split(",")(0)
        if (first.toString.indexOf("_") >= 0) {
          retvalue = first
        }
      }
      retvalue
    }

 // println(toRemerged( s1))

    val s2: String = "20161207_11:31_v40"
    val first = s2.split(",")(0)
    println(first.toString().lastIndexOf('_'))
    println( first.substring(first.toString().lastIndexOf('_') + 2).toInt)

    first.substring(first.toString().lastIndexOf('_') + 2).toInt

    println( first.substring(16))

    def toEVersion(s2: String): String = {
      var retvalue = "v26"
      if (s2 != null && s2 != "" && s2.toString.indexOf("_") >= 0) {
        val first = s2.split(",")(0)
        if (first.toString.indexOf("_") >= 0) {
          retvalue = first.substring(first.toString().lastIndexOf('_') + 1)
          val retvalue1 = first.substring(first.toString().lastIndexOf('_') + 2).toInt
          val retvalue2 = "v26"
          if (retvalue1 < 26) {
            retvalue = retvalue2
          } else retvalue
        }
      }
      retvalue
    }

    val s4: String = "01/01/2015 11:11"

    def toDate(s4:String) : String = {
      val dat = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm").parse(s4)
      var cal: Calendar = Calendar.getInstance()
      cal.setTime(dat)
      val minuteFormat = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm").format(cal.getTime)
      //cal.getTime
        minuteFormat
    //  minuteFormat.foreach(println)
    }

    println(toDate(s4))

    val s5: String = "01/01/2015 11:11"

    def todateformat(s5: String): String = {
      var retvalue = ""
      //  12/07/2017 hh:mm
      if (s5 != null && s5 != "" && s5.toString.indexOf("/") >= 0) {

        val V2 =

          (
            s5.substring((s5.lastIndexOf("/") - 2), (s5.lastIndexOf("/") + 1)) +
              s5.substring((s5.lastIndexOf("/") - 5), (s5.lastIndexOf("/") - 3)) + "/" +
              s5.substring(s5.lastIndexOf("/") + 1, 10)
            )
        retvalue = V2
      }

      retvalue

    }

    println(todateformat(s5))

    // println(toEVersion( s2))

    }
  }
