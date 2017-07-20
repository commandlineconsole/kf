package edu

import org.apache.spark.{SparkConf, SparkContext}

object token extends App {

  val conf = new SparkConf().setAppName("WordCount")
  conf.setMaster("local[*]")
  val sc = new SparkContext(conf)

val titles = sc.textFile("C:\\msg\\kafka\\kf\\kf\\README.md")

  val titlescontain = titles.filter(x => x.contains("Spark"))

  val textline = titlescontain.flatMap(x => x.split(",")).takeOrdered(1000)
  //textline.foreach(println)
  println(textline)
  textline.foreach(println)

}

