package edu

import org.apache.spark.{SparkConf, SparkContext}

object Map_03 {

  def main(args: Array[String]): Unit = {


    val conf = new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)

    /*val names2 = sc.parallelize(List("apple", "beatty", "beatrice")).map(a => (a, a.size))
    val names3 =  names2.flatMap(t => Array(t._2)).reduce(_ + _)
    val names4 =  names2.flatMap(t => Array(t._1)).reduce(_ + _)
    val names5 =  names2.flatMap(t => Array(t._1))

    println(names2)
    println(names3)
    println(names4)
    println(names5)
*/
  /* val v1 =  sc.parallelize(List(1,2,3)).flatMap(x=>List(x,x,x)).collect
  //   sc.parallelize(List(1,2,3)).map(x=>List(x,x,x)).collect
    println(v1)
    v1.foreach(println)

    val names2 = sc.parallelize(List("apple", "beatty", "beatrice"))

    println("******* 123 ********")
    println(names2.count())
    println("******* 456 ********")

    val names3 = sc.parallelize(List("apple", "beatty", "beatrice"))

    println(names3.first)
    println(names3.take(2))
    names3.foreach(println)
*/

/*
        val hockeyTeams = sc.parallelize(List("wild", "blackhawks", "red wings", "wild", "oilers", "whalers", "jets", "wild"))
        val v2 = hockeyTeams.map(k => (k,1)) //.countByKey

         println(v2)
        v2.foreach(println)
*/


 /*          val babyNamesToTotalCount = sc.textFile("C:\\msg\\kafka\\kf\\kf\\README.md")
             .map(line => line.split(","))
             .map(n => (n(1), n(2))*/

 //          println(babyNamesToTotalCount.countByKey)
    //       babyNamesToTotalCount.foreach(println)


    val lines = sc.textFile("C:\\msg\\kafka\\kf\\kf\\README.md")
    val lineLengths = lines.map(s => s.length)
    val totalLength = lineLengths.reduce((a, b) => a + b)
    lineLengths.persist()
    println(totalLength)


      }
}
