/*
package edu

import org.apache.hadoop.io.{BytesWritable, NullWritable}
import org.apache.spark.rdd.RDD
import org.apache.spark.serializer.KryoSerializer
import org.apache.spark.{SparkConf, SparkContext}

import scala.reflect.ClassTag

object SerDe {

  def main(args: Array[String]) {

    val conf1 = new SparkConf().setAppName("WordCount")
    conf1.setMaster("local[*]")
    val sc1 = new SparkContext(conf1)

    class Person(val name: String)

    if (args.length < 1) {
      println("Please provide output path")
      return
    }
    val outputPath = args(0)

    val conf = new SparkConf().setMaster("local").setAppName("kryoexample")
    conf.set("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
    val sc = new SparkContext(conf)

    //create some dummy data
    val personList = 1 to 10000 map (value => new Person(value + ""))
    val personRDD = sc.makeRDD(personList)

    def saveAsObjectFile[T: ClassTag](rdd: RDD[T], path: String)
    val kryoSerializer = new KryoSerializer(rdd.context.getConf)


    def objectFile[T](sc: SparkContext, path: String, minPartitions: Int = 1)(implicit ct: ClassTag[T]) = {
      val kryoSerializer = new KryoSerializer(sc.getConf)
      sc.sequenceFile(path, classOf[NullWritable], classOf[BytesWritable],
        minPartitions)
        .flatMap(x => {
          val kryo = kryoSerializer.newKryo()
          val input = new Input()
          input.setBuffer(x._2.getBytes)
          val data = kryo.readClassAndObject(input)
          val dataObject = data.asInstanceOf[Array[T]]
          dataObject
        })
    }

    saveAsObjectFile(personRDD, outputPath)
    val rdd = objectFile[Person](sc, outputPath)
    println(rdd.map(person => person.name).collect().toList)

  }
}*/
