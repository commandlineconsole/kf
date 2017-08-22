package gitbook


    class Person(val name:String, var age:Int)

    object val_var_def_differences extends App{

      // Evaluted on define
      val person = new Person("Robin", 20)

      println("ago: "+person.age)
      person.age = 31
      println("current: "+person.age)
    }


