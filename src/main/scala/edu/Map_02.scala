package edu

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by Ja on 17/07/2017.
  */
object Map_02 {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)

    val parallel1 = sc.parallelize(1 to 9, 5)
    val p2 = parallel1.mapPartitions( x => List(x.next).iterator).collect
    println(p2)
    p2.foreach(println)

 /*   val parallel = sc.parallelize(1 to 9, 5)

    val p1 = parallel.mapPartitionsWithIndex(

      (index: Int, it: Iterator[Int]) => it.toList.map(x => index + ", "+x).iterator

    ).collect

  p1.foreach(println)*/

  }
}

/*
1
2
4
6
8*/
/*
0, 1
1, 2
1, 3
2, 4
2, 5
4, 9
3, 6
3, 7
4, 8*/
