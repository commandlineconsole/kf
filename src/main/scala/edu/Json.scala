package edu

import org.apache.spark.{SparkConf, SparkContext}

object Json {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)

    val lines = sc.textFile("C:\\msg\\kafka\\kf\\kf\\README.md")
    val lineLengths = lines.map(s => s.length)
    val totalLength = lineLengths.reduce((a, b) => a + b)
    lineLengths.persist()
    println(totalLength)

  }
}
