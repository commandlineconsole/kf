/*
object CDR {

  def main(args: Array[String]): Unit = {

*/
/*    try {

      val rdd1 = JobSparkConf.sc.textFile("c:\\spark\\CDR11111.csv")
      import JobSparkConf.sqlContext.implicits._

      val df1 = rdd1.map(x => (x.split(",")(0), x.split(",")(1).toInt, x.split(",")(2), x.split(",")(3))).toDF("loc", "duration", "phone", "errorcode")

      val dffilter = df1.filter(df1("errorcode").equalTo("0x829F08"))
      val dffiltergroup = dffilter.groupBy("phone").sum("duration").toDF("grpPhone", "maxduration")

      //  dffiltergroup.sort($"maxduration" desc).limit(10).show(11)

      df1.registerTempTable("t1")
      val df2 = JobSparkConf.sqlContext.sql("Select phone, sum(duration) as sd from t1 where errorcode='0x829F08' group by phone order by sum(duration) desc  limit 10")
      df2.show(10)
    }
    catch {
      case e: Exception => "file missing"
        println("file not found exception")
    }*//*


    val rdd1 = JobSparkConf.sc.textFile("c:\\spark\\CDR11111.csv")
    import JobSparkConf.sqlContext.implicits._

    val df1 = rdd1.map(x => (x.split(",")(0), x.split(",")(1).toInt, x.split(",")(2), x.split(",")(3))).toDF("loc", "duration", "phone", "errorcode")

    val dffilter = df1.filter(df1("errorcode").equalTo("0x829F08"))
    val dffiltergroup = dffilter.groupBy("phone").sum("duration").toDF("grpPhone", "maxduration")

    //  dffiltergroup.sort($"maxduration" desc).limit(10).show(11)

    df1.registerTempTable("t1")
    val df2 = JobSparkConf.sqlContext.sql("Select phone, sum(duration) as sd from t1 where errorcode='0x829F08' group by phone order by sum(duration) desc  limit 10")
    df2.show(10)



  }
}
*/
