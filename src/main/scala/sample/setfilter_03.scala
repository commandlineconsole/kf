package sample

import org.apache.spark.{SparkConf, SparkContext}

object setfilter_03 {

  val conf = new SparkConf().setAppName("WordCount")
  conf.setMaster("local[*]")
  val sc = new SparkContext(conf)

  def main(args: Array[String]): Unit = {
    val x = sc.parallelize(1 to 10, 2)

    // filter operation
    val y = x.filter(e => e%2==0)
    val y1 = y.collect
    println(y1)

    val y2 = x.filter(_ % 2 == 0)
    val y3 = y2.collect
    println(y3)

  }
}
