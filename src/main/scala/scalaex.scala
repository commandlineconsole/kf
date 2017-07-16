package sample
import org.apache.spark._

// import spark.sqlContext.implicits._
// import spark.implicits._

object scalaex {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)

    val lines = sc.textFile("C:\\msg\\kafka\\kf\\kf\\README.md")
    val lineLengths = lines.map(s => s.length)
    val lineLengths2 = lines.flatMap(s => s.split(" "))
      .map(word => (word, 1))
      .reduceByKey(_ + _)

    val rdd2 = lineLengths2.count()

    lineLengths.persist()
    println("lineLengths  :" +lineLengths)
    println("totalLength  :" +rdd2)
    lineLengths2.collect().foreach(println)
    lines.foreach(println)

/*
   val lines = sc.textFile("C:\\msg\\kafka\\kf\\kf\\README.md")

    val rdd = lines.flatMap(x => x.split(" "))
                    .map(word => (word, 1))
                    .reduceByKey(_ + _)

    import sqlContext.implicits._

    val rdd2 = rdd.filter(_!="Spark")

     println("Print the count of the words  :" +  rdd)
    rdd.foreach(println)
*/

/*   val sqlContext = new org.apache.spark.sql.SQLContext(sc)

    val mapRDD= sc.parallelize(Seq(
      Map("empid" -> "12", "empName" -> "Rohan", "depId" -> "201"),
      Map("empid" -> "13", "empName" -> "Ross", "depId" -> "201"),
      Map("empid" -> "14", "empName" -> "Richard", "depId" -> "401"),
      Map("empid" -> "15", "empName" -> "Michale", "depId" -> "501"),
      Map("empid" -> "16", "empName" -> "John", "depId" -> "701")))

    val columns=mapRDD.take(1).flatMap(a=>a.keys)*/

   /* val resultantDF=mapRDD.map{value=>
      val list=value.values.toList
      (list(0),list(1),list(2))
    }.toDF(columns:_*)*/

    // [_1: string, _2: string, _3: string]
    // [empid: string, empName: string, depId: string]
  //  println(mapRDD)
//    println(mapRDD)
//
//    println(mapRDD.id)

  }
}


