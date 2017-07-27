package edu
import org.apache.spark.{SparkConf, SparkContext}

object Interivew extends App{

  val conf = new SparkConf().setAppName("WordCount")
  conf.setMaster("local[*]")
  val sc = new SparkContext(conf)

    def apply(x: Int): Int = x * 2

    def unapply(z: Int) =
       if (z%2 == 0) Some(z/2) else None

  println("apply(2) : " + apply(2))
  println("unapply(3) : " + unapply(3))

// *****************
    val lines = sc.textFile("C:\\msg\\kafka\\kf\\kf\\README.md")
    //val  errors = lines.filter( x => x.contains("Spark1")).count()
 //   println("errors :" + errors)

// *****************
  def square(x: Int): Int = x*x
  def square2(x: Int) = 2 + 2 + 2
  def square1(x: Int): Int = { x*x }

 // nums.reduce(_ + _)
  println("square(10) : " +square(10))
  println("square2(23) : " +square2(23))
  println("square1(20) : " +square1(20))
/*
  // *****************

  val nums = Array(1, 2, 3)

  nums.map((x: Int) => x + 2) // => Array(3, 4, 5)
  nums.map(x => x + 2)  // => samenums.map(_ + 2)       // => same
  nums.reduce((x, y) => x + y) // => 6 nums.reduce(_ + _)           // => 6

  // *****************

  val pair1 = (1,2,3,4,5)

  println("pair1._1 :" +pair1._1.!=(4))
  println("pair1._2 :" + pair1._2.equals(2))
  println("pair1._3 :" + pair1._3.!=())
  println("pair1._4 :" + pair1._4.>=(3))

  // *****************

/*  val nums10 = sc.parallelize([1, 2, 3])

  nums10.collect() // # => [1, 2, 3]
  nums10.take(2)  // # => [1, 2]
  nums10.count()  // # => 3
  nums10.reduce(lambda x, y: x + y)  // # => 6
  nums10.saveAsTextFile(“hdfs://file.txt”)*/

  // ******************/

}



