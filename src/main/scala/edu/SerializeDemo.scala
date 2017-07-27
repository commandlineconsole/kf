/*
package edu

import java.io._

object SerializeDemo2 { // Serializable
class Employee extends Serializable {
  var name string
  var address String
  var SSN = 0 //   public transient int SSN
  var number = 0
  /*  public void mailCheck() {
                  System.out.println("Mailing a check to " + name + " " + address);
              }*/
}

  def main(args: Array[String]): Unit = {
    val e = new Employee
    e.name = "Reyan Ali"
    e.address = "Phokka Kuan, Ambehta Peer"
    e.SSN = 1112
    e.number = 101
    try {
      val fileOut = new FileOutputStream("C:\\msg\\kafka\\kf\\kf\\README12.md")
      val out = new ObjectOutputStream(fileOut)
      out.writeObject(e)
      out.close()
      fileOut.close()
      System.out.printf("Serialized data is saved in /tmp/employee.ser")
    } catch {
      case i: IOException =>
        i.printStackTrace()
    }
    //  Deserialized
    var e1 = null
    try {
      val fileIn = new FileInputStream("C:\\msg\\kafka\\kf\\kf\\README12.md")
      val in = new ObjectInputStream(fileIn)
      e1 = in.readObject.asInstanceOf[Employee]
      in.close()
      fileIn.close()
    } catch {
      case i: IOException =>
        i.printStackTrace()
        return
      case c: ClassNotFoundException =>
        System.out.println("Employee class not found")
        c.printStackTrace()
        return
    }
    System.out.println("Deserialized Employee...")
    System.out.println("Name: " + e1.name)
    System.out.println("Address: " + e1.address)
    System.out.println("SSN: " + e1.SSN)
    System.out.println("Number: " + e1.number)
  }
}*/
