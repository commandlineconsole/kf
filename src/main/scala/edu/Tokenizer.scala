package edu

import org.apache.spark.{SparkConf, SparkContext}


  object Tokenizer {
    def main(args: Array[String]): Unit = {

      /*   val logFile = "C:\\msg\\kafka\\kf\\kf\\README.md" // Should be some file on your system
      val sc = new SparkContext("local", "Tokenizer App", "/path/to/spark-0.9.1-incubating",
        List("target/scala-2.10/simple-project_2.10-1.0.jar"))*/

      val conf = new SparkConf().setAppName("WordCount")
      conf.setMaster("local[*]")
      val sc = new SparkContext(conf)

      val lines = sc.textFile("C:\\msg\\kafka\\kf\\kf\\README.md")


      //val logData = sc.textFile(lines, 2).cache()

      val tokens = lines.flatMap(line => line.split(","))
                         .map(word => (word, 1))
                         .reduceByKey((a, b) => a + b)

   //   val termFrequency = tokens.map(word => (word, 1)).reduceByKey((a, b) => a + b)

    // termFrequency.collect.map(tf => println("Term, Frequency: " + tf))

       tokens.foreach(println)

    //  println(tokens)

   //   println(termFrequency)

      /*  tokens.saveAsTextFile("C:\\msg\\kafka\\kf\\kf\\README2.md")
      termFrequency.saveAsTextFile("C:\\msg\\kafka\\kf\\kf\\README3.md")
    */
    }

  }
