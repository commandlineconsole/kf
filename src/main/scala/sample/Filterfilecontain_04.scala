package sample
import org.apache.spark.{SparkConf, SparkContext}

object Filterfilecontain_04 {

  val conf = new SparkConf().setAppName("WordCount")
  conf.setMaster("local[*]")
  val sc = new SparkContext(conf)

  def main(args: Array[String]): Unit = {

    val textFile = sc.textFile("C:\\msg\\kafka\\kf\\kf\\README.md")
    val linesWithSpark = textFile.filter(line => line.contains("Spark"))
    val linecount = textFile.count()
    val firstline = textFile.first()
    val lastline = textFile.first()

    val countnum = textFile.filter(line => line.contains("Spark")).count()
    val countred = textFile.map(line => line.split(" ").size).reduce((a, b) => if (a > b) a else b)
    val countred1 = textFile.map(line => line.split(" ").size).reduce((a, b) => if (a > b) a else b)

    val countered2 = textFile.map(line => line.split(" ").size)
                             .reduce((a, b) => Math.max(a, b))

    // / println(linesWithSpark)
    linesWithSpark.foreach(println)
     println("linecount :" +linecount)
    println("firstline :" + firstline)
    println("countnum :" + countnum)
    println("countred :" + countred)
    println("countred1 :" + countred1)
    println("countred2 :" + countred1)

/*    val logFile = "YOUR_SPARK_HOME/README.md" // Should be some file on your system
    val spark = SparkSession.builder.appName("Simple Application").getOrCreate()*/
  //  val logData = spark.read.textFile(logFile).cache()
    val numAs = textFile.filter(line => line.contains("a")).count()
    val numBs = textFile.filter(line => line.contains("b")).count()

    println(s"Lines with a: $numAs, Lines with b: $numBs")


  }

}
