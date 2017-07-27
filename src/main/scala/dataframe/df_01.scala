package dataframe

import org.apache.spark.{SparkConf, SparkContext}

object df_01 {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)

/*import
    val llist = Seq(("bob", "2015-01-13", 4), ("alice", "2015-04-23",10))
    val left = llist.toDF("name","date","duration")
    val right = Seq(("alice", 100),("bob", 23)).toDF("name","upload")

    val df = left.join(right, left.col("name") === right.col("name"))

    display(df)*/

  }

}
