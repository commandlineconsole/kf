package dataframe

import org.apache.spark.sql.SQLContext
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

    // Create the Departments
    val department1 = new Department("123456", "Computer Science")
    val department2 = new Department("789012", "Mechanical Engineering")
    val department3 = new Department("345678", "Theater and Drama")
    val department4 = new Department("901234", "Indoor Recreation")

    // Create the Employees
    val employee1 = new Employee("michael", "armbrust", "no-reply@berkeley.edu", 100000)
    val employee2 = new Employee("xiangrui", "meng", "no-reply@stanford.edu", 120000)
    val employee3 = new Employee("matei", null, "no-reply@waterloo.edu", 140000)
    val employee4 = new Employee(null, "wendell", "no-reply@princeton.edu", 160000)

    // Create the DepartmentWithEmployees instances from Departments and Employees
    val departmentWithEmployees1 = new DepartmentWithEmployees(department1, Seq(employee1, employee2))
    val departmentWithEmployees2 = new DepartmentWithEmployees(department2, Seq(employee3, employee4))
    val departmentWithEmployees3 = new DepartmentWithEmployees(department3, Seq(employee1, employee4))
    val departmentWithEmployees4 = new DepartmentWithEmployees(department4, Seq(employee2, employee3))

  //  List(departmentWithEmployees1)

    val sqlContext = {
      new SQLContext(sc)
    }


  }

}
