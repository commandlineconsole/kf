package dataframe

import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}


object df {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)

    val sqlContext = new SQLContext(sc)

    // Define the schema using a case class
    case class Person(name: String, age: Int)

    import org.apache.spark.rdd.RDD
    val peopleRDD: RDD[Person] = sc.parallelize(Seq(Person("Jacek", 10)))

    peopleRDD.foreach(println)

    require(sc.version.replace(".", "").substring(0,3).toInt >= 160, "Spark 1.6.0+ required to run this notebook.")

    //val sqlContext = new SQLContext(sc)
    import sqlContext.implicits._
//    rdd.toDF()

    val dataset = Seq(1, 2, 3).toDS()
    dataset.show()

    println("dataset.show() " + dataset.show() )

    case class Person2(name: String, age: Int)

 /*   val personDS = Seq(Person("Max", 33), Person("Adam", 32), Person("Muller", 62)).toDS()
    personDS.show()
*/
/*    import org.apache.spark.rdd.RDD
    val people = peopleRDD.toDS


    val teenagers = people.where('age >= 10).where('age <= 19).select('name).as[String]

     teenagers.show
    */

}

}
