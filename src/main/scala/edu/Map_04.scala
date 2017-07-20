package edu

import org.apache.spark.sql.Row
import org.apache.spark.sql.types.{StringType, StructField, StructType}
import org.apache.spark.{SparkConf, SparkContext}

import scala.collection.immutable.HashMap

/**
  * Created by Ja on 19/07/2017.
  */
object Map_04 {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)

    val newMap: HashMap[String, String] = HashMap(

      ("A", "23_null_12_09asfA"),
      ("B", "24_null_13_09asfB"),
      ("C", "25_null_14_09asfC"),
      ("D", "25_null_14_09asfC"),
      ("E", "25_null_14_09asfC"),
      ("F", "25_null_14_09asfC"),
      ("G", "25_null_14_09asfC"))

    val schema = StructType(Array(

      StructField("col1", StringType, true),
      StructField("col2", StringType, true)

    ))

    val rdd = sc.parallelize(newMap.map(

      hashmap => Row.fromSeq(

      hashmap._2.split("_")

    )).toSeq)

    schema.printTreeString()

 rdd.foreach(println)




  }

}
