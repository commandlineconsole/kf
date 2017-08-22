package dataframe

import org.apache.spark.{SparkConf, SparkContext}

object df_02 {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)

    // Create the case classes for our domain
    case class Department(id: String, name: String)
    case class Employee(firstName: String, lastName: String, email: String, salary: Int)
    case class DepartmentWithEmployees(department: Department, employees: Seq[Employee])

    val department1 = new Department("123456", "Computer Science")

    val employee1 = new Employee("michael", "armbrust", "no-reply@berkeley.edu", 100000)
    val employee2 = new Employee("xiangrui", "meng", "no-reply@stanford.edu", 120000)


    val departmentWithEmployees1 = new DepartmentWithEmployees(department1, Seq(employee1, employee2))

    //  List(departmentWithEmployees1)

    println(departmentWithEmployees1.department)


  }

}
