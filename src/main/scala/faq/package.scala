
package faq

  class Person(var name: String, var age: Int)

object val_var_def_differences extends App{
  def person = new Person("Robin", 20)

  // Evaluted on Call
  println("ago: "+person.age)

  // Evaluted on Call
  person.age = 31

  // Evaluted on Call
  println("current: "+person.age)
}
